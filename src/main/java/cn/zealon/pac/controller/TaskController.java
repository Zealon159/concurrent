package cn.zealon.pac.controller;

import cn.zealon.pac.Task;
import cn.zealon.pac.config.QueueBean;
import cn.zealon.pac.consumer.TaskConsumer;
import cn.zealon.pac.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;
import java.util.UUID;

/**
 * 生产者控制器
 * @auther: Zealon
 * @Date: 2018-06-29 11:28
 */
@Controller
@RequestMapping("task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private QueueBean queueBean;

    @ResponseBody
    @PostMapping("insert")
    public Object insert(int taskNum){
        for (int i=0;i<taskNum;i++){
            TaskConsumer taskConsumer = new TaskConsumer(queueBean.getQueue());
            Task task = new Task();
            task.setId(UUID.randomUUID().toString());
            task.setJsonData("{\"type\":\"任务类型\",\"data\":\"数据\"}");
            task.setState(0);
            task.setCreateTime(new Date());
            taskConsumer.setTask(task);
            taskService.insert(taskConsumer);
        }
        return "ok";
    }

    @ResponseBody
    @GetMapping("size")
    public Object getQueueSize(){
        return taskService.getQueueSize();
    }

    @ResponseBody
    @GetMapping("thread")
    public Object getThreadInfo(){
        return taskService.getThreadInfo().toString();
    }

}
