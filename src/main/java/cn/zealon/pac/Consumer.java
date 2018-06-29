package cn.zealon.pac;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @auther: Zealon
 * @Date: 2018-06-29 11:00
 */
public class Consumer implements Runnable {

    private ArrayBlockingQueue<Task> queue;

    public Consumer(ArrayBlockingQueue<Task> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                Task task = queue.take();
                task.setState(1);
                task.setFinishTime(new Date());
                System.out.println(Thread.currentThread().getName()+"消费："+task.getId());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
