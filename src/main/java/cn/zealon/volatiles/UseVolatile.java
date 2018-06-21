package cn.zealon.volatiles;

/**
 * volatile特性 - 线程间共享变量
 */
public class UseVolatile implements Runnable {
    //volatile
    private  boolean stop = true;

    public boolean getStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        while (stop==true) {
            //System.out.println("stop:" + stop);
        }
        System.out.println("线程终止了。");
    }

    public static void main(String[] args){
        UseVolatile uv = new UseVolatile();
        Thread t1 = new Thread(uv);
        t1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        uv.setStop(false);
        System.out.println("stop 设置了false");

    }
}
