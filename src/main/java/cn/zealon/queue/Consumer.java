package cn.zealon.queue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * @Author: zealon
 * @Version: 1.0
 */
public class Consumer implements Runnable {

    private static int i=0;

    private ArrayBlockingQueue queue;

    public Consumer(ArrayBlockingQueue queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Task task = (Task)queue.poll();
        if(task!=null) {
            i++;
            System.out.println(Thread.currentThread().getName() + " 消费" + task.getTaskName()+" "+i);
        }
    }
}
