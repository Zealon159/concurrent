package cn.zealon.thread.mycase;

/**
 * @auther: Zealon
 * @Date: 2018-10-15 14:40
 */
public class Case3 {
    public static boolean flag = false;
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<3;i++){
            new Thread(){
                @Override
                public void run() {
                    String threadName = Thread.currentThread().getName();
                    while (true){
                        System.out.println(threadName+" read flag value:"+flag);
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }.start();
        }

        Thread.sleep(5000);
        flag = true;
    }
}
