package cn.zealon.pac;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @auther: Zealon
 * @Date: 2018-06-29 10:55
 */
public class Producer implements Runnable {

    private int breadCount = 0;

    private static int currentCount = 0;

    private ArrayBlockingQueue<Task> queue;

    public Producer(ArrayBlockingQueue<Task> queue,int breadCount) {
        this.queue = queue;
        this.breadCount=breadCount;
    }

    @Override
    public void run() {
        producerTask();
    }

    /*
        生产数据
     */
    private void producerTask(){
        while(currentCount <= breadCount){
            Task task=new Task();
            task.setId(UUID.randomUUID().toString());
            task.setJsonData("{\"type\":\"任务类型\",\"data\":\"数据\"}");
            task.setState(0);
            task.setCreateTime(new Date());
            try {
                queue.put(task);
                System.out.println("生产："+task.getId());
                currentCount++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
