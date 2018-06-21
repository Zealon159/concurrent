package cn.zealon.thread;

import java.util.Date;

/**
 * 继承Thread类，需要重写run方法（因为Thread类也实现了Runable 接口）.
 *
 * @auther: Zealon
 * @Date: 2018-06-21 16:44
 */
public class UseThread extends Thread{
    @Override
    public void run() {
        System.out.println("当前线程名称："+Thread.currentThread().getName()+
                "，时间："+new Date().toString());
    }

    public static void main(String[] args){
        UseThread instance = new UseThread();
        instance.start();
    }
}
