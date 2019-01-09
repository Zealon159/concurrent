package cn.zealon.thread.mycase;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther: Zealon
 * @Date: 2019-01-03 11:43
 */
public class CaseExchanger {

    private static Exchanger<String> exchanger = new Exchanger<String>();

    private static ExecutorService executorService = Executors.newFixedThreadPool(2);

    public static void main(String[] args){
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                String a = "银行流水A";
                try {
                    String result = exchanger.exchange(a);
                    System.out.println("t1:"+result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                String b = "银行流水B";
                try {
                    String result = exchanger.exchange(b);
                    System.out.println("t2:"+result);
                    System.out.println("a equals b:"+result.equals(b)+" a:"+result+" b:"+b);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        executorService.shutdown();
    }
}
