package com.zealon.synchronizes;

public class UseSynchronize {

    //初始化1000张火车票
    public static int trainTickets = 1000;

    public static void main(String[] args){
        //10个线程同时进行取票
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int j=0;j<100;j++) {
                        trainTickets--;
                        //System.out.println(trainTickets);
                    }
                    System.out.println(trainTickets);
                }
            }).start();
        }

    }
}
