package cn.zealon.cases;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

/**
 * 计算任务
 * @auther: Zealon
 * @Date: 2018-11-15 15:22
 */
public class Task implements Runnable{
    private CountDownLatch countDownLatch;// 线程完成计数器
    private ConcurrentHashMap<Object,Object> result;  // 存储结果
    private int month; // 月份

    public Task(CountDownLatch countDownLatch,ConcurrentHashMap<Object,Object> result,int month){
        this.countDownLatch = countDownLatch;
        this.result = result;
        this.month = month;
    }

    @Override
    public void run() {
        try {
            System.out.println("查询并计算 " + this.month + " 合同平均单价.");

            // 获得结果，并存入map
            String averageUnitPrice = countingAverageUnitPrice();
            result.put(month, averageUnitPrice);
        }finally {
            // 累计计数器
            countDownLatch.countDown();
        }
    }

    // 模拟计算结果（随机数）
    public String countingAverageUnitPrice(){
        // 可以查询数据库，再进行业务公式计算等等 ...
        double price = Math.random()*10;
        DecimalFormat df = new DecimalFormat("###.00");
        return df.format(price);
    }
}
