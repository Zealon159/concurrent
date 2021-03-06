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
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public UseWaitAndNotify(int second){
        this.second = second;
    }

    public synchronized void greenLight() throws InterruptedException {
        while (true){
            for(int i=second;i>=0;i--) {
                Thread.sleep(1000);

                if(i==0){
                    System.out.println(Thread.currentThread().getName()+":红灯停。");
                    /**
                     * 当前路线红灯后，开启另一条路线的绿灯。
                     * 这里创建一个线程，根据当前的路名称，判断后续绿灯线程并启动。
                     */
                    Runnable runnable;
                    Thread t;
                    if(Thread.currentThread().getName().equals("南北路")){
                        runnable = new UseWaitAndNotify(3);
                        t = new Thread(runnable);
                        t.setName("东西路");
                    }else{
                        runnable = new UseWaitAndNotify(5);
                        t = new Thread(runnable);
                        t.setName("南北路");
                    }
                    t.start();
                    //挂起当前红灯，等待绿灯线程执行到红灯后，再执行
                    //wait();
                    Thread.currentThread().interrupt();
                    ThreadGroup group = Thread.currentThread().getThreadGroup();
                    System.out.println("当前活动线程数："+group.activeCount());

                }else {
                    System.out.println(Thread.currentThread().getName() + ":绿灯，倒计时" + i + "s");
                }
            }
            //通知
            //notify();
        }
    }

    @Override
    public void run() {
        try {
            greenLight();
        } catch (InterruptedException e) {

        }
    }

    public static void main(String[] args) {

        UseWaitAndNotify nanbei = new UseWaitAndNotify(5);
        Thread t1 = new Thread(nanbei);
        t1.setName("南北路");
        t1.start();

    }
}
