package cn.zealon.concurrent.ch2;

/**
 * @auther: Zealon
 * @Date: 2018-09-06 14:17
 */
public class ThreadInit {

    public static void main(String[] args){

    }

    private void init(){
        Thread t1 = Thread.currentThread();
        t1.setName("精灵");
        t1.setPriority(1);

    }
}
