package cn.zealon.thread.cooperate;

/**
 * wait() notify() 用例
 *
 * @auther: Zealon
 * @Date: 2018-06-21 20:28
 */
public class UseWaitAndNotify implements Runnable{

    //秒
    private int second = 10;

    public UseWaitAndNotify(int second){
        this.second = second;
    }

    public synchronized void greenLight() throws InterruptedException {
        while (true){
            for(int i=second;i>=0;i--) {
                Thread.sleep(1000);
                if(i==0){
                    System.out.println(Thread.currentThread().getName()+":红灯");
                    wait();
                }
                System.out.println(Thread.currentThread().getName()+":绿灯，倒计时"+i);

            }
            notify();
        }
    }

    @Override
    public void run() {
        try {
            greenLight();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Runnable runnable = new UseWaitAndNotify(5);

        for (int i=0;i<3600;i++) {
            Thread t1 = new Thread(runnable);
            t1.setName("南北路");

            Thread t2 = new Thread(runnable);
            t2.setName("东西路");

            t1.start();
            t2.start();
        }
    }
}
