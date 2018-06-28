package cn.zealon.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 阻塞队列
 *
 * @Author: zealon
 * @Version: 1.0
 */
public class UseBlockingQueue {


    public static void main(String[] args){
        ArrayBlockingQueue queue = new ArrayBlockingQueue(10);

        ExecutorService executorService = Executors.newFixedThreadPool(6);

        for(int i=0;i<30;i++){
            Producer producer = new Producer(queue);
            executorService.execute(producer);
            Consumer consumer = new Consumer(queue);
            executorService.execute(consumer);
        }



        executorService.shutdown();

    }
}
