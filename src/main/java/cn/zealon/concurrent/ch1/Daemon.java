package cn.zealon.concurrent.ch1;

/**
 * @auther: Zealon
 * @Date: 2018-09-06 13:26
 */
public class Daemon {

    public static void main(String[] args){
        Thread t1 = new Thread(new DaemonRunner(),"DaemonRunner");
        t1.setDaemon(true);
        t1.start();
        System.out.println("Daemon Thread run.");
    }

    static class DaemonRunner implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("Daemon Thread finally run.");
            }
        }
    }
}