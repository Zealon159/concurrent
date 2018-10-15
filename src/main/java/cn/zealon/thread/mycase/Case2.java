package cn.zealon.thread.mycase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @auther: Zealon
 * @Date: 2018-10-15 14:33
 */
public class Case2 {
    public static volatile int num = 0;
    public static AtomicInteger atomicNum = new AtomicInteger();
    static CountDownLatch countDownLatch = new CountDownLatch(10);
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++){
            new Thread(){
                @Override
                public void run() {
                    for(int j=0;j<1000;j++){
                        num++;
                        atomicNum.addAndGet(1);
                    }
                    countDownLatch.countDown();
                    System.out.println(num);
                    System.out.println(atomicNum.get());
                }
            }.start();
        }
        countDownLatch.await();
        System.out.println("end:"+num+","+atomicNum.get());
    }


}
