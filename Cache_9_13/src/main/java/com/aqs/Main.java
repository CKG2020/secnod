package com.aqs;



import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {

    private static CyclicBarrier barrier = new CyclicBarrier(31);
    private static int a = 0;
    private static SelfAbstractQueueSynchronizer test = new SelfAbstractQueueSynchronizer();

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {

        for(int i = 0; i < 30; i++) {
            Thread t = new Thread(new Runnable(){

                @Override
                public void run() {
                    for(int i = 0; i < 1000; i++) {
                        unlockIncrement();
                    }
                    try {
                        barrier.await();
                    } catch (Exception e) {
                        e.printStackTrace();;
                    }
                }

            });
            t.start();
        }

        barrier.await();
        System.out.println("unlock model a= " + a);

        System.out.println("##########################");

        barrier.reset();
        a = 0;
        for(int i = 0; i < 30; i++) {
            Thread t = new Thread(new Runnable(){
                @Override
                public void run() {
                    for(int i = 0; i < 1000; i++ ) {
                        lockIncrement();
                    }

                    try {
                        barrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }

            });
            t.start();
        }

        barrier.await();
        System.out.println("lock model a= " + a);

    }

    public static void unlockIncrement() {
        a++;
    }

    public static void lockIncrement() {
        test.lock();
        a++;
        test.unlock();
    }

}
