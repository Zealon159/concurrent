package cn.zealon.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多个线程的顺序执行
 * @auther: Zealon
 * @Date: 2018-11-07 13:53
 */
public class CaseSeq {
    public static void main(String[] args) throws InterruptedException {
        //case1();
        new CaseSeq().case2();
    }

    /**
     * 基于线程池单线程去顺序执行
     */
    public static void case1(){
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 run.");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2 run.");
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t3 run.");
            }
        });

        ExecutorService service = Executors.newSingleThreadExecutor();
        for(int i=0;i<10;i++) {
            service.execute(t1);
            service.execute(t2);
            service.execute(t3);
        }
        service.shutdown();
    }

    /**
     *
     */
    public void case2() throws InterruptedException {


        //T3 t3 = new T3(t2);


    }

    private class T3 extends Thread{
        @Override
        public void run() {
            System.out.println("t3 run.");
        }
    }
}
