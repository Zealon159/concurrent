package cn.zealon.pac.config;

import cn.zealon.pac.consumer.TaskConsumer;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @auther: Zealon
 * @Date: 2018-06-29 14:30
 */
@Component
public class ConsumerTaskEventSubscribe implements InitializingBean {

    @Autowired
    private QueueBean queueBean;

    @Override
    public void afterPropertiesSet() throws Exception {
        TaskConsumer consumer = new TaskConsumer(queueBean.getQueue());
        for(int i=0;i<5;i++){
            queueBean.getExecutorService().execute(new Thread(consumer));
        }
        System.out.println("consumer started...");
    }
}
