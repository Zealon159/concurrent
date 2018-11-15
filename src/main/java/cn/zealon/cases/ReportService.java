package cn.zealon.cases;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther: Zealon
 * @Date: 2018-11-15 15:47
 */
public class ReportService {

    public static void main(String[] args){
        ReportService reportService = new ReportService();

        ConcurrentHashMap<Object,Object> map = reportService.getAverageUnitPrice();

        // 打印结果
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+"月，平均单价："+entry.getValue());
        }
    }

    // 模拟1-12 月平均单价报表统计计算
    public ConcurrentHashMap<Object,Object> getAverageUnitPrice(){
        ConcurrentHashMap<Object,Object> map = new ConcurrentHashMap<>();

        // 创建一个12个大小的线程池
        ExecutorService tool = Executors.newFixedThreadPool(12);

        // 创建12大小的计数器
        CountDownLatch countDownLatch = new CountDownLatch(12);

        for (int i = 1; i <= 12; i++) {
            Task task = new Task(countDownLatch,map,i);
            tool.execute(task);
        }
        try{
            // 等待所有任务执行完毕，继续执行主线程
            countDownLatch.await();
            System.out.println("-----------------计算完成，打印结果-----------------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 关闭线程池
        tool.shutdown();

        return map;
    }

}
