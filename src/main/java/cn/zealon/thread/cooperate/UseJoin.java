package cn.zealon.thread.cooperate;

/**
 * join() 用例
 *
 * 对于以下代码，虽然 b 线程先启动，但是因为在 b 线程中调用了 a 线程的 join() 方法，
 * b 线程会等待 a 线程结束才继续执行，因此最后能够保证 a 线程的输出先于 b 线程的输出。
 * @auther: Zealon
 * @Date: 2018-06-21 20:05
 *
 */
public class UseJoin {

    private class A extends Thread{
        @Override
        public void run() {
            System.out.println("A");
        }
    }

    private class B extends Thread{

        private A a;

        B(A a) {
            this.a = a;
        }

        @Override
        public void run() {
            try {
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    public void test() {
        A a = new A();
        B b = new B(a);
        b.start();
        a.start();
    }

    public static void main(String[] args) {
        UseJoin useJoin = new UseJoin();
        useJoin.test();
    }
}
