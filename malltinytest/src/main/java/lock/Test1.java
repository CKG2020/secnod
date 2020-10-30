package lock;

import java.util.concurrent.CountDownLatch;
public class Test1 {
    public  static long  count=100000000L;

    private  static  class T {
        //从内存中读取数据　一次读一个缓存行　　工业平衡过程　　一个缓存行　　６４个字节

        public long p1,p2,p3,p4,p5,p6,p7;
        public volatile  long x=0L;
        public long p8,p9,p10,p11,p12,p13,p14;
    }

    public static  T[] arr=new T[2];

    static {
        arr[0]=new T();
        arr[1]=new T();
    }

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Thread t1=new Thread(()->{
            for (int i = 0; i < count; i++) {
                arr[0].x=i;
            }
            countDownLatch.countDown();
            System.out.println(arr[0].x);
        });

        Thread t2=new Thread(()->{
            for (int i = 0; i < count; i++) {
                arr[0].x=i;
            }
            countDownLatch.countDown();
            System.out.println(arr[1].x);

        });

        final long start = System.nanoTime();
        t1.start();
        t2.start();

        countDownLatch.await();
        System.out.println((System.nanoTime()-start)/1000000);



    }





}
