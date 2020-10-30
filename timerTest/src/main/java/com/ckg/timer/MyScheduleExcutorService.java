package com.ckg.timer;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MyScheduleExcutorService {
    public static void main(String[] args) {
       //使用时才创建
        ExecutorService pool1 = Executors.newCachedThreadPool();
        //即使空闲不使用  还需要保留制定数目的线程供给使用
        ExecutorService pool2 = Executors.newScheduledThreadPool(100);
        //单一线程池
        ExecutorService pool3 = Executors.newSingleThreadExecutor();
      ScheduledExecutorService  scheduledExecutorService
              =Executors.newScheduledThreadPool(10);

      scheduledExecutorService.scheduleAtFixedRate(()->
     {
          System.out.println("Run Schedule:"+new Date());
      },1,3, TimeUnit.SECONDS);
    }
}
