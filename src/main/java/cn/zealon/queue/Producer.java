package cn.zealon.queue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @Author: zealon
 * @Version: 1.0
 */
public class Producer implements Runnable {

    private static int i = 0;
    private ArrayBlockingQueue queue;

    public Producer(ArrayBlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        if(queue.remainingCapacity()==queue.size()){
            System.out.println("队列已满.");
        }
        i++;
        Task task = new Task();
        task.setTaskName("香蕉");
        queue.offer(task);
        System.out.println(Thread.currentThread().getName() + "生产了第"+i+"个 " + task.getTaskName());

    }
}
