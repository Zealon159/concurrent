package cn.zealon.volatiles;

/**
 * volatile特性 - 非原子性
 */
public class UseVolatile2 implements Runnable{

    //private static AtomicInteger num = new AtomicInteger(0);
    private static volatile int num =0;

    public static void addNum(){
        for (int i=0;i<100;i++){
            num++;
            //num.addAndGet(1);
        }
        System.out.println("num:"+num);
    }

    @Override
    public void run() {
        addNum();
    }

    public static void main(String[] args){
        UseVolatile2[] useVolatile2 =new UseVolatile2[10];

        for(int i=0;i<10;i++){
            useVolatile2[i]=new UseVolatile2();
        }

        for (int i=0;i<useVolatile2.length;i++){
            new Thread(useVolatile2[i]).start();
        }
    }
}
