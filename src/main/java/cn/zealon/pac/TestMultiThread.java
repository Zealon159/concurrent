package cn.zealon.pac;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther: Zealon
 * @Date: 2018-06-29 11:15
 */
public class TestMultiThread {
    public static int queueSize = 10;

    public static ArrayBlockingQueue<Task> queue = new ArrayBlockingQueue<Task>(queueSize);

    //创建固定6个线程的线程池
    private static ExecutorService executorService = Executors.newFixedThreadPool(6);

    public static void main(String[] args)  {
        Producer producer = new Producer(queue,50);
        executorService.execute(producer);

        //多线程消费
        Consumer consumer = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);
        executorService.execute(consumer);
        executorService.execute(consumer2);
    }
}
