package cn.zealon.lock;

import org.springframework.transaction.annotation.Transactional;

/**
 * @auther: Zealon
 * @Date: 2018-11-15 14:41
 */
public class UseSynchronize4 {

    public synchronized void A(){
        System.out.println("run A synchronized");
    }

    public void B(){
        synchronized (this){
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        T1 t1 = new T1("线程1");
        T1 t2 = new T1("线程2");

        t1.start();
        t2.start();
    }
}

class T1 extends Thread{
    private String name;

    public T1(String name){
        this.name=name;
    }

    @Override
    public void run() {
        System.out.println(this.name);
        UseSynchronize4 u1 = new UseSynchronize4();
        u1.B();
    }
}
