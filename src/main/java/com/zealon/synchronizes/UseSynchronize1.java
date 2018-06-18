package com.zealon.synchronizes;

/**
 * synchronized 锁
 */
public class UseSynchronize1 implements Runnable {

    //初始化100张火车票
    public int tickets = 100;

    /**
     * synchronized 保证线程安全
     * 说明：被synchronized修饰的内容，保证了在同一时刻，只能有一个线程访问此内容，从而实现了线程安全。
     * 原理：当多个线程访问时，每个线程会尝试获得锁，如果拿到锁则执行该内容，执行后释放锁，其它线程继续竞争锁...
     */
    @Override
    public void run() {
        tickets--;
        System.out.println(Thread.currentThread().getName()+":"+tickets);
    }

    public static void main(String[] args){

        UseSynchronize1 myThread = new UseSynchronize1();

        Thread t1 = new Thread(myThread,"t1");
        Thread t2 = new Thread(myThread,"t2");
        Thread t3 = new Thread(myThread,"t3");
        Thread t4 = new Thread(myThread,"t4");
        Thread t5 = new Thread(myThread,"t5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
