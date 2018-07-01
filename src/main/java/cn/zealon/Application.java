package cn.zealon;

import cn.zealon.pac.config.QueueBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.concurrent.*;

@SpringBootApplication
public class Application {

    @Bean
    public QueueBean queueBean(){
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<>(50);
        QueueBean queueBean = new QueueBean();
        queueBean.setQueue(blockingQueue);
        ExecutorService executorService = new ThreadPoolExecutor(
                5,          //core
                10,     //max
                120L,      //两分钟
                TimeUnit.SECONDS,       //单位
                blockingQueue);

        queueBean.setExecutorService(executorService);
        return queueBean;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
