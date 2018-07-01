package cn.zealon.lock;

/**
 * 多个对象多个锁的特性
 */
public class UseSynchronize2 {

    //票价
    private static int ticketPrice = 0;

    /**
     * 根据到达目的地，设置票价
     * @param place
     *            目的地
     * @desc
     *  使用 static 修饰， 使synchronized的锁定义在class级上，保证了并发访问时，只能有一个线程能访问
     */
    public static synchronized void arrivePlace(String place){
        if(place.equals("拉萨")){
            ticketPrice = 500;
            System.out.println("place:"+place+",set ticketPrice over!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if(place.equals("漠河")){
            ticketPrice = 350;
            System.out.println("place:漠河,set ticketPrice over!");
        }
        System.out.println("place:"+place+",ticketPrice:"+ticketPrice);
    }

    public static void main(String[] args){
        UseSynchronize2 m1 = new UseSynchronize2();
        UseSynchronize2 m2 = new UseSynchronize2();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                m1.arrivePlace("拉萨");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                m2.arrivePlace("漠河");
            }
        });

        t1.start();
        t2.start();
    }
}
