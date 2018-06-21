package cn.zealon.executor;

import java.util.Date;

/**
 * @auther: Zealon
 * @Date: 2018-06-21 17:17
 */
public class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("当前线程名称："+Thread.currentThread().getName()+
                "，时间："+new Date().toString());
    }
}
