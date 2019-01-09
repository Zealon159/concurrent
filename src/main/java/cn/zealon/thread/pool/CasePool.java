package cn.zealon.thread.pool;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther: Zealon
 * @Date: 2018-10-25 09:22
 */
public class CasePool {
    public static void main(String[] args){

        //ExecutorService executorService = Executors.newFixedThreadPool(3);

        //ExecutorService service2 = Executors.newCachedThreadPool();

        int a = 10>>1;  //a=5
        int b = a++;    //a=6,b=5
        int c = ++a;    //a=7,c=7
        int d = b*a++;  //d=35,a=8
        System.out.println(a+" "+b+" "+c+" "+d);

        System.out.println(10 >> 3);

        System.out.println(-10>>3);
    }
}
