package com.ckg.lock.ProducerAndConsumer;

import java.util.concurrent.atomic.AtomicInteger;

public class Sync {
    /**
     * 消费者
     */
    static class Consumer extends Thread {
        private final AtomicInteger dataHolder;
        private final Object consumerLock;
        private final Object producerLock;

        Consumer(AtomicInteger dataHolder, Object consumerLock, Object producerLock) {
            this.dataHolder = dataHolder;
            this.consumerLock = consumerLock;
            this.producerLock = producerLock;
        }

        @Override
        public void run() {
            super.run();
            while (true) {

                // 阻塞，等待生产者唤醒
                try {
                    synchronized (consumerLock) {
                        consumerLock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                // 消费数据
                System.out.println("消费->" + dataHolder.get());
                System.out.println();

                // 消费完了，通知生产者开始生产
                synchronized (producerLock) {
                    producerLock.notifyAll();
                }
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }





    static class Producer extends Thread {
        private final AtomicInteger dataHolder;
        private final Object consumeLock;
        private final Object productLock;

        Producer(AtomicInteger dataHolder, Object consumeLock, Object productLock) {
            this.dataHolder = dataHolder;
            this.consumeLock = consumeLock;
            this.productLock = productLock;
        }


        @Override
        public void run() {
            super.run();
            while (true) {

                // 生产数据
                System.out.println("生产->" + dataHolder.incrementAndGet());

                // 唤醒消费者，去消费数据
                synchronized (consumeLock) {
                    consumeLock.notifyAll();
                }

                // 阻塞生产者
                synchronized (productLock) {
                    try {
                        productLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // 睡眠一会儿，不要生产过快
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

            }
        }
    }



    public static void main(String[] args) throws InterruptedException {
        final AtomicInteger dataHolder = new AtomicInteger();
        final Object consumeLock = new Object();
        final Object productLock = new Object();
        Producer producer = new Producer(dataHolder, consumeLock, productLock);
        Consumer consumer = new Consumer(dataHolder, consumeLock, productLock);
        consumer.start();
        producer.start();
        consumer.join();
        producer.join();
    }
}

