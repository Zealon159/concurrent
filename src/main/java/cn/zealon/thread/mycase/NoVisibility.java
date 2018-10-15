package cn.zealon.thread.mycase;

import org.springframework.transaction.annotation.Transactional;

/**
 * @auther: Zealon
 * @Date: 2018-10-15 16:27
 */
public class NoVisibility {

    public static void main(String[] args) throws InterruptedException {
        boolean finalReady = false;
        int finalNumber = 0;
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(!finalReady) {
                    Thread.yield();
                }
                System.out.println(finalNumber);
            }
        }).start();


        /*finalNumber = 42;
        finalReady = true;*/
    }
}