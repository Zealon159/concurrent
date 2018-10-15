package cn.zealon.thread.mycase;

/**
 * @auther: Zealon
 * @Date: 2018-10-15 16:17
 */
public class Case5 {
    private static boolean ready = true;
    private static int number;
    private static class ReadThread extends Thread{
        @Override
        public void run() {

            while (ready){
                System.out.println(1);

                Thread.yield();
            }
            System.out.println(ready);
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReadThread().start();
        Thread.sleep(2000);
        number = 55;
        ready = false;
    }
}
