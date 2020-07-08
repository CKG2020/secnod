package com.ckg.lock;

class pcSync {

    private static int count = 0;

    public static void main(String[] args) {
        pcSync pcSync = new pcSync();

        new Thread(pcSync.new Produce1(pcSync), "p1").start();
        new Thread(pcSync.new Consumer1(pcSync), "c1").start();
//        new Thread(pcSync.new Produce1(pcSync),"p2").start();
//        new Thread(pcSync.new Consumer1(pcSync),"c2").start();
//        new Thread(pcSync.new Produce1(pcSync),"p3").start();
//        new Thread(pcSync.new Consumer1(pcSync),"c3").start();
//        new Thread(pcSync.new Produce1(pcSync),"p4").start();
//        new Thread(pcSync.new Consumer1(pcSync),"c4").start();


    }

    class Produce1 implements Runnable {
        private pcSync pcSync;

        public Produce1(pcSync pcSync) {
            this.pcSync = pcSync;
        }

        @Override
        public void run() {
            for (int i = 0; i <= 10; i++) {
                synchronized (pcSync) {
                    while (count == 10) {

                        try {
                            System.out.println("已达到容量，释放锁");
                            pcSync.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    count++;
                    System.out.println(Thread.currentThread().getName() + "生产，目前总共有" + count);
                    pcSync.notifyAll();
                }

            }

        }
    }

    class Consumer1 implements Runnable {
        private pcSync pcSync;

        public Consumer1(pcSync pcSync) {
            this.pcSync = pcSync;
        }

        @Override
        public void run() {
            for (int i = count; i >= 0; i--) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (pcSync) {
                    while (count == 0) {
                        System.out.println("已经消费完，释放锁，唤醒生产者");
                        try {
                            pcSync.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    count--;
                    System.out.println(Thread.currentThread().getName() + "消费，目前总共有" + count);
                    pcSync.notifyAll();
                }


            }


        }
    }
}