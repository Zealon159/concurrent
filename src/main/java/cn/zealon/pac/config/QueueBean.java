package cn.zealon.pac.config;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;

/**
 * 阻塞队列、线程池配置类
 * @auther: Zealon
 * @Date: 2018-06-29 11:39
 */
public class QueueBean {

    private BlockingQueue<Runnable> queue;

    private ExecutorService executorService;

    public ExecutorService getExecutorService() {
        return executorService;
    }

    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public BlockingQueue<Runnable> getQueue() {
        return queue;
    }

    public void setQueue(BlockingQueue<Runnable> queue) {
        this.queue = queue;
    }

}
