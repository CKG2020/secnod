package com.ckg.lock;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockQueueTest {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> abq=new ArrayBlockingQueue<>(2);
//        abq.put("abc");
//        abq.put("qqq");
//        System.out.println("xxxxx");
//        abq.put("yyy");//阻塞类型
        boolean b=abq.offer("zbc");
        System.out.println(b);
//        b=abq.offer("xxx");
//        System.out.println(b);
//        b=abq.offer("yyy");
//        System.out.println(b);
        int size = abq.size();
        System.out.println(size);
    }
}
