package cn.zealon.pac;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @auther: Zealon
 * @Date: 2018-06-29 11:03
 */
public class Test {

    public static int queueSize = 10;

    public static ArrayBlockingQueue<Task> queue = new ArrayBlockingQueue<Task>(queueSize);

    public static void main(String[] args)  {
        Producer producer = new Producer(queue,50);
        Consumer consumer = new Consumer(queue);

        Thread p1 = new Thread(producer);
        Thread c1 = new Thread(consumer);
        p1.start();
        c1.start();
    }
}
