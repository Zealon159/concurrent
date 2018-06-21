package cn.zealon.thread;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现Callable接口，需要实现call方法；
 * 与Runnable方式比较，Callable方式有返回值，返回值通过FutureTask进行封装.
 *
 * @auther: Zealon
 * @Date: 2018-06-21 16:44
 */
public class UseCallable implements Callable<String> {

    @Override
    public String call() {
        return "当前时间:"+new Date().toString();
    }

    public static void main(String[] args){
        UseCallable instance = new UseCallable();
        //封装任务类
        FutureTask<String> futureTask = new FutureTask<String>(instance);
        //创建线程类
        Thread thread = new Thread(futureTask);
        //启动线程
        thread.start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
