package cn.zealon.thread;

/**
 * @auther: Zealon
 * @Date: 2018-11-07 14:41
 */
public class CaseJoin {
    public static void main(String[] args) throws InterruptedException {
        final Thread join1 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("join1");
            }
        }, "T1");

        final Thread join2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("join2");
                try {
                    join1.join();//确定join1执行完毕
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "T2");
        final Thread join3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("join3");
                try {
                    join2.join();//确定join2执行完毕
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "T3");
        join1.start();
        join1.join();
        join2.start();
        join2.join();
        join3.start();
    }

}
