package com.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class ContainerTest2 {
    public static void main(String[] args) {
        final CyclicBarrier barrier=new CyclicBarrier(4,new Runnable(){
            public void run(){
                System.out.println(Thread.currentThread().getName()+"任务全部结束");
            }
        });
        final int[][] array={{1,2,3,4,5,6,7,8},{10,20,30,40,50,60,70,80},{100,200,300,400,500,600,700,800},{1000,2000,3000,4000,5000,6000,7000,8000}};
        for(int i=0;i<4;i++){
            new Thread(new CyclicBarrierService(array,i,barrier)).start();
        }
    }
}
