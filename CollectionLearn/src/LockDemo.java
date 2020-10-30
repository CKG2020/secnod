import  java.util.concurrent.locks.Lock;
import  java.util.concurrent.locks.ReentrantLock;

public class LockDemo  implements  Runnable {

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        get();
    }

    public  void get() {
        try {
            lock.lock();
            System.out.println("get");
            set();
            System.out.println(Thread.currentThread().getName());
        } finally {
            lock.unlock();
        }
//        System.out.println("get");
    }

    public    void set() {
        try {

            lock.lock();
            System.out.println("set");
        } finally {
            lock.unlock();
        }
//        System.out.println("set");
    }


    public static void main(String[] args) throws InterruptedException {

        LockDemo lockDemo = new LockDemo();
        for (int i = 0; i < 100; i++) {
            Thread t1 = new Thread(lockDemo, "t1");

            Thread t2 = new Thread(lockDemo, "t2");

            t1.start();
            t2.start();
//            t1.join();
//            t2.join();
        }

//        for (int i = 0; i < 10; i++) {
//            new Thread(lockDemo,"t2").start();
////            new Thread(lockDemo,"t2").start();
//        }

    }

}