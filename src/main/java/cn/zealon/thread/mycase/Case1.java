package cn.zealon.thread.mycase;

/**
 * @auther: Zealon
 * @Date: 2018-10-15 13:54
 */
public class Case1 {
    private int j = 0;
    public static void main(String[] args){

        /*Thread t1 = new Thread(new AddThread());
        Thread t2 = new Thread(new AddThread());
        Thread t3 = new Thread(new AddThread());
        t1.start();
        t2.start();
        t3.start();*/
        //System.out.println(j);
        ShowThread  st =new ShowThread();
        ShowThread  st2 =new ShowThread();
        Thread v1 = new Thread(st);
        Thread v2 = new Thread(st2);
        v1.start();
        v2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        st.setShop(true);


    }


}

class AddThread implements Runnable{
    private static volatile int j = 0;
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            j++;
        }
        System.out.println(j);
    }
}

class ShowThread implements Runnable{
    private volatile boolean shop = false;
    public void setShop(boolean shop){
        this.shop =shop;
    }
    public boolean getShop() {
        return this.shop;
    }

    @Override
    public void run() {
        int i = 0;
        while (!shop){
            i++;
            try{
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println(shop+",end..");
    }
}

