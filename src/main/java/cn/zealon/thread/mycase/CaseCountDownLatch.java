package cn.zealon.thread.mycase;

import java.util.concurrent.CountDownLatch;

/**
 * @auther: Zealon
 * @Date: 2019-01-03 10:38
 */
public class CaseCountDownLatch {

    public static void main(String[] args) throws InterruptedException {
        // 线程计数器
        CountDownLatch countDownLatch = new CountDownLatch(5);

        for (int i = 0; i < 5; i++) {
            String threadName = "thread"+(i+1);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+": run.");
                    countDownLatch.countDown();
                }
            },threadName).start();
        }

        countDownLatch.await();
        System.out.println("等待指定线程任务执行完，我才执行！");

    }
}
