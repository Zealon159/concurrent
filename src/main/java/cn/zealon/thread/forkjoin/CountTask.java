package cn.zealon.thread.forkjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * @auther: Zealon
 * @Date: 2018-10-17 09:24
 */
public class CountTask extends RecursiveTask<Integer> {

    // 阈值
    private static final int THRESHOLD = 2;

    private int start;

    private int end;

    public CountTask(int start,int end){
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        int sum = 0;

        // 如果任务足够小，就计算任务
        boolean canCompute = (end - start) <= THRESHOLD;
        if(canCompute){
            for(int i=start;i<=end;i++){
                sum += i;
            }
        }else{
            // 如果任务大于阈值，分列两子任务进行计算
            int middle = (start+end)/2;
            CountTask leftTask = new CountTask(start,middle);
            CountTask rigthTask = new CountTask(middle+1,end);

            // 执行子任务
            leftTask.fork();
            rigthTask.fork();

            // 等待子任务完成，获得结果
            int leftResult = leftTask.join();
            int rightResult = rigthTask.join();

            // 合并子任务结果
            sum = leftResult + rightResult;
        }

        return sum;
    }

    public static void main(String[] args){
        ForkJoinPool pool = new ForkJoinPool();

        // 生成一个计算任务，计算 1+2+3+4+5+..
        CountTask task = new CountTask(1,7);
        // 执行任务
        Future<Integer> result = pool.submit(task);;
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
