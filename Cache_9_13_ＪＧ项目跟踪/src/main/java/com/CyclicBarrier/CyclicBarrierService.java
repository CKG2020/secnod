package com.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierService implements Runnable{
    private int[][] array;
    private int row;
    private CyclicBarrier barrier;
    public CyclicBarrierService(int[][] array,int row,CyclicBarrier barrier) {
        this.array = array;
        this.row=row;
        this.barrier=barrier;
    }

    public void handle(){
        System.out.println(Thread.currentThread().getName()+"开始处理");
        int sum=0;
        for(int i=0;i<array[0].length;i++){
            sum+=array[row][i];
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"处理完第"+row+"行，结果为"+sum);
    }

    @Override
    public void run() {
        handle();
        try {
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
