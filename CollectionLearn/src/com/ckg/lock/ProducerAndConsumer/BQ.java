package com.ckg.lock.ProducerAndConsumer;



import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class LogThread extends Thread {
    final protected void log(String message) {
        System.out.println(getName() + ":" + message);
    }
}

class ProductThread extends LogThread {
    private final BlockingQueue<Integer> queue;

    ProductThread(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        super.run();
        int i = 0;
        while (true) {
            try {
                queue.put(++i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log("生产->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ConsumerThread extends LogThread {
    private final BlockingQueue<Integer> queue;

    public ConsumerThread(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            Integer data = null;
            try {
                data = this.queue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (data != null) {
                log("消费->" + data);
                System.out.println();
            }
        }

    }
}

public class  BQ {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        ProductThread productThread = new ProductThread(queue);
        for (int i = 0; i < 5; i++) {
            ConsumerThread consumerThread = new ConsumerThread(queue);
            consumerThread.start();
        }
        productThread.start();
        productThread.join();
    }

}
