package com.ckg.lock;

import org.omg.PortableServer.THREAD_POLICY_ID;

import javax.security.auth.login.Configuration;
import java.util.concurrent.ArrayBlockingQueue;


public class ProComTest1 {

       private static int count=0;
       ArrayBlockingQueue<Integer>  abq=new  ArrayBlockingQueue(10);
    public static void main(String[] args) throws InterruptedException {

        ProComTest1 proComTest1 = new ProComTest1();
//        Producer producer = new Producer();
//        Consumer consumer = new Consumer();
        Thread pro = new Thread(proComTest1.new Producer(),"t1");
        Thread cos = new Thread(proComTest1.new Consumer(),"t2");
        pro.start();
        cos.start();

//
//        ProComTest1 proComTest1 = new ProComTest1();
//        Producer producer = new Producer(abq);
//        Consumer consumer = new Consumer(abq);
////     Thread t1=new Thread(proComTest1.new Producer(abq),"t1");
////        Thread t2=new Thread(proComTest1.new Producer(abq),"t2");
////       Thread t3=new Thread(proComTest1.new Consumer(abq),"t3");
////        Thread t4=new Thread(proComTest1.new Consumer(abq),"t4");
//
//
//
//        Thread t1 = new Thread(proComTest1.new Producer(abq),"t1");
//        Thread t1 = new Thread(producer,"t1");
//        Thread t2 = new Thread(producer,"t2");
//        Thread t3 = new Thread(consumer,"t3");
//        Thread t4 = new Thread(consumer,"t4");
//
//
//
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t1.join();
//        t2.join();
//        t3.join();
//        t4.join();
//        Thread.sleep(5000);
//        System.out.println("读取结束");


    }


 class  Producer implements  Runnable {
     
        @Override
        public void run() {
//      if(abq.size()<=10){
//       try {
//           abq.put("xxx");
//           System.out.println("放入队列一个元素");
//       } catch (InterruptedException e) {
//           e.printStackTrace();
//       }
//   }
//    else
//      {
//          System.out.println("集合已满");
//      }
//
//    }
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    abq.put(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
                System.out.println(Thread.currentThread().getName()+"存入"+"目前共有"+count+"个元素");
            }
        }


    }




   class  Consumer  implements  Runnable{
      

        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i <10 ; i++) {
                if(abq.size()>0){
                    try {
                        abq.take();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName()+"取出"+"目前共有"+count+"元素");
                }
            }
        }
    }




}
