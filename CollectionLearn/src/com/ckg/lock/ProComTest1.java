package com.ckg.lock;

import org.omg.PortableServer.THREAD_POLICY_ID;

import java.util.concurrent.ArrayBlockingQueue;

class  Producer implements  Runnable {
    private ArrayBlockingQueue aqs;

    public Producer(ArrayBlockingQueue aqs) {
        this.aqs = aqs;
    }

    @Override
    public void run() {
//      if(aqs.size()<=10){
//       try {
//           aqs.put("xxx");
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
        }
    }


}




class  Consumer  implements  Runnable{
    private  ArrayBlockingQueue aqs;

    public Consumer(ArrayBlockingQueue aqs) {
        this.aqs = aqs;
    }

    @Override
    public void run() {
      if(aqs.size()>0){
          try {
              aqs.take();
              System.out.println("从队列取出一个元素");
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }
}

public class ProComTest1 {


//    public static void main(String[] args) {
//        ArrayBlockingQueue<String>  abq=new  ArrayBlockingQueue(10);
//        Producer producer = new Producer(abq);
//        Consumer consumer = new Consumer(abq);
//        Thread pro = new Thread(producer);
//        Thread cos = new Thread(consumer);
//        pro.start();
//        cos.start();
//    }


}
