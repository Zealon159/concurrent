package cn.zealon.thread.cooperate;

/**
 * 线程实现交通红绿灯场景。
 * @auther: Zealon
 * @Date: 2017-09-05 19:53
 */
public class UseInterrupt implements Runnable{

    //路灯时长（秒）
    private int second = 10;
    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public UseInterrupt(int second){
        this.second = second;
    }

    public synchronized void redGreenLight() throws InterruptedException {
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
                        runnable = new UseInterrupt(3);
                        t = new Thread(runnable);
                        t.setName("东西路");
                    }else{
                        runnable = new UseInterrupt(5);
                        t = new Thread(runnable);
                        t.setName("南北路");
                    }
                    t.start();
                    //停止当前路灯线程
                    Thread.currentThread().interrupt();
                    //打印当前运行线程数
                    ThreadGroup group = Thread.currentThread().getThreadGroup();
                    System.out.println("当前活动线程数："+group.activeCount());

                }else {
                    System.out.println(Thread.currentThread().getName() + ":绿灯，倒计时" + i + "s");
                }
            }
        }
    }

    @Override
    public void run() {
        try {
            redGreenLight();
        } catch (InterruptedException e) {
e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        UseInterrupt nanbei = new UseInterrupt(5);
        Thread t1 = new Thread(nanbei);
        t1.setName("南北路");
        t1.start();
    }

}
