package cn.zealon.thread;

import java.util.Date;

/**
 * 实现Runnable接口，需要实现 run() 方法。
 *
 * @auther: Zealon
 * @Date: 2018-06-21 16:43
 *
 */
public class UseRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("当前线程名称："+Thread.currentThread().getName()+
                "，时间："+new Date().toString());
    }

    //运行线程实例
    public static void main(String[] args) {
        UseRunnable instance = new UseRunnable();
        Thread thread = new Thread(instance);
        thread.start();
    }
}
