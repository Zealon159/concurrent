package cn.zealon.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 重入锁
 * 相比synchronized，多了以下功能：
 * 1、等待过程可中断
 * 2、可实现公平锁
 * 3、可绑定多个条件
 *
 * 相比synchronized 之间的差异
 * 1、synchronized是JVM实现的，ReentrantLock是JDK实现的
 * 2、ReentrantLock多了些高级功能，使用起来更灵活一些，但是需要注意死锁问题。
 *    而synchronized 则不用担心没有释放锁导致死锁的问题（JVM会保证锁的释放）。
 *
 */
public class UseReentrantLock implements Runnable {

    private Lock lock = new ReentrantLock();

    public void func(){
        lock.lock();
        System.out.println("\n"+Thread.currentThread().getName());

        try{
            for(int i=0;i<10;i++){
                System.out.print(" "+i);
            }
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        func();
    }

    public static void main(String[] args){
        UseReentrantLock useReentrantLock = new UseReentrantLock();
        //UseReentrantLock useReentrantLock2 = new UseReentrantLock();
        Thread t1 = new Thread(useReentrantLock);
        Thread t2 = new Thread(useReentrantLock);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.shutdown();
    }
}
