package cn.zealon.thread.mycase;

/**
 * @auther: Zealon
 * @Date: 2018-10-15 15:36
 */
public class Case4 {
    volatile int s = 5;
    volatile int k = 10;

    public void changeS(int v){
        /*s = 8;
        k = s;*/
        this.s = v;
    }

    public void printS(){
        System.out.println("s:"+s+",k:"+k);
    }

    public static void main(String[] args){
        Case4 case4 = new Case4();
        while (true){

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    case4.changeS(8);
                }
            }).start();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    case4.printS();
                }
            }).start();
        }
    }
}
