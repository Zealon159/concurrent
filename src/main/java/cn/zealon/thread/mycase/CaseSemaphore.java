package cn.zealon.thread.mycase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 控制并发线程数
 * @auther: Zealon
 * @Date: 2018-10-17 10:29
 */
public class CaseSemaphore {
    // 定义线程数量
    private static final int THREAD_COUNT = 50;
    // 创建固定数量的线程池
    private static ExecutorService threadPool = Executors.newFixedThreadPool(THREAD_COUNT);
    // 创建并发控制器(10)
    private static Semaphore semaphore = new Semaphore(10);

    public static void main(String[] args){
        for(int i=0;i<THREAD_COUNT;i++){
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        Thread.sleep(500);
                        System.out.println("run thread "+Thread.currentThread().getName());
                        semaphore.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        threadPool.shutdown();
    }
}
