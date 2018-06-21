package cn.zealon.executor;

import java.util.concurrent.*;

/**
 * @auther: Zealon
 * @Date: 2018-06-21 17:16
 */
public class UseExecutor {
    public static void main(String[] args) {

        cachedThreadPool();

        //fixedThreadPool();

        //singleThreadExecutor();
    }

    //一个任务创建一个线程
    public static void cachedThreadPool(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 6; i++) {
            executorService.execute(new Task());
        }
        executorService.shutdown();
    }

    //所有任务只能使用固定大小的线程
    public static void fixedThreadPool(){
        //只有2个线程可用
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 6; i++) {
            executorService.execute(new Task());
        }
        executorService.shutdown();
    }

    //相当于大小为 1 的 FixedThreadPool
    public static void singleThreadExecutor(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 6; i++) {
            executorService.execute(new Task());
        }
        executorService.shutdown();
    }

    //自定义创建线程池
    public static void customCreateExecutor(){

        ExecutorService executorService =new ThreadPoolExecutor(2,3,2000, TimeUnit.SECONDS,
                null);

        executorService.shutdown();
    }
}
