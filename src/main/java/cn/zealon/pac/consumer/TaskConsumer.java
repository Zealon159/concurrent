package cn.zealon.pac.consumer;


import cn.zealon.pac.Task;

import java.util.Date;
import java.util.concurrent.BlockingQueue;

/**
 * @auther: Zealon
 * @Date: 2018-06-29 15:02
 */
public class TaskConsumer implements Runnable {

    private Task task;

    private BlockingQueue<Runnable> queue;

    public TaskConsumer(BlockingQueue<Runnable> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try {
                TaskConsumer taskConsumer = (TaskConsumer) queue.take();

                System.out.println(Thread.currentThread().getName()+"消费："+taskConsumer.getTask().getId());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
