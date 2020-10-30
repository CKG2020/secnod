package com.ckg.lock;


class Lock1 {

}

class MyNet1 implements Runnable {
    private Lock1 l = null;
    public MyNet1(Lock1 l) {
        this.l = l;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(6000);
            synchronized (this.l) {
                this.l.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




class Myrun implements Runnable {
    private Lock1 l;

    public Myrun(Lock1 l) {
        this.l = l;
    }

    @Override
    public void run() {
        synchronized (l) {
            System.out.println(Thread.currentThread().getName() + "======");
            System.out.println("man" + Thread.currentThread().getName());

            try {
//                Thread.sleep(3000);
                System.out.println("qing qiu ");
//                new MyNet1(this.l);   重入锁
                new Thread(new MyNet1(this.l)).start();
                this.l.wait();  //shifanglingpai bingqie shuimian
                System.out.println("yi jing huo huo qu ");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("complete" + Thread.currentThread().getName());
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Lock1 lock1 = new Lock1();
        Thread t1 = new Thread(new Myrun(lock1), "t1");
        Thread t2 = new Thread(new Myrun(lock1), "t2");
        Thread t3 = new Thread(new Myrun(lock1), "t3");

        t1.start();
        t2.start();
        t3.start();


    }


}