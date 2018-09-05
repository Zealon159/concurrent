package cn.zealon.concurrent.ch1;

/**
 * @auther: Zealon
 */
public class ThreadStateTest {
    public static void main(String[] args){
        new Thread(new TimeWaiting(),"TimeWaitingThread").start();
    }

    //线程不间断地进行睡眠
    static class TimeWaiting implements Runnable{
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
