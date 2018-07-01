package cn.zealon.pac.service;

import cn.zealon.pac.config.QueueBean;
import cn.zealon.pac.consumer.TaskConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @auther: Zealon
 * @Date: 2018-06-29 11:26
 */
@Component
public class TaskService {

    @Autowired
    private QueueBean queueBean;

    public void insert(TaskConsumer task){
        try {
            queueBean.getQueue().put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Object getQueueSize(){
        return "size:"+queueBean.getQueue().size();
    }

    //获取所有线程
    public Object getThreadInfo(){
        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];
        currentGroup.enumerate(lstThreads);
        for (int i = 0; i < noThreads; i++)
            System.out.println("线程号：" + i + " = " + lstThreads[i].getName());
        return lstThreads;
    }
}
