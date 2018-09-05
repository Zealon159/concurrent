package cn.zealon.concurrent.ch1;

/**
 * @auther: Zealon
 */
public class PriorityTest {
    public static void main(String[] args) throws Exception{
        Job job1 = new Job(10);
        Thread t1 = new Thread(job1);
        t1.setPriority(10);
        t1.setName("优先级较高");

        Job job2 = new Job(5);
        Thread t2 = new Thread(job2);
        t2.setPriority(5);
        t2.setName("优先级平均");

        Job job3 = new Job(1);
        Thread t3 = new Thread(job3);
        t3.setPriority(1);
        t3.setName("优先级较低");

        t3.start();
        t2.start();
        t1.start();
    }
}

class Job implements Runnable{
    private int prority;
    public Job(int prority){
        this.prority = prority;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+",prority:" + prority);
    }
}
