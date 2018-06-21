package cn.zealon.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UseSynchronize3 implements Runnable {

    public void func() {
        synchronized (UseSynchronize3.class) {
            System.out.println("\n"+Thread.currentThread().getName());
            for (int i = 0; i < 10; i++) {
                System.out.print(" "+i);
            }
        }
    }

    @Override
    public void run() {
        func();
    }

    public static void main(String[] args){
        UseSynchronize3 useSynchronize3 = new UseSynchronize3();
        UseSynchronize3 useSynchronize32 = new UseSynchronize3();
        Thread t1 = new Thread(useSynchronize3);
        Thread t2 = new Thread(useSynchronize32);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.shutdown();
    }
}
