package cn.zealon.concurrent.ch2;


/**
 * @auther: Zealon
 * @Date: 2018-09-06 15:31
 */
public class ThreadInterrupt {

    public static void main(String[] args){
        Thread t1 = new Thread(new MyThread(),"精灵线程");
        t1.start();
        try {
            //main线程休眠10毫秒
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止精灵线程
        t1.interrupt();
    }
}

class MyThread implements Runnable{
    private long i=0;
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            i++;
        }
        System.out.println(Thread.currentThread().getName()+" 运行10毫秒，i 值累加结果:"+i);
    }
}
