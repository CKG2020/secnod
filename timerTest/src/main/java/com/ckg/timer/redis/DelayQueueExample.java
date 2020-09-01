package com.ckg.timer.redis;

import redis.clients.jedis.Jedis;

import java.time.Instant;
import java.util.Set;


public class DelayQueueExample {

    private  static  final  String _KEY="myTaskQueue";

    public static void main(String[] args) throws InterruptedException {
         Jedis jedis=JedisUtils.getJedis();
//           doTask(jedis);
        //30s后执行
        long epochSecond = Instant.now().plusSeconds(30).getEpochSecond();
        //继续添加测试数据
        jedis.zadd(_KEY,epochSecond,"order_1");
        jedis.zadd(_KEY,Instant.now().plusSeconds(2).getEpochSecond(),"order_2");
        jedis.zadd(_KEY,Instant.now().plusSeconds(2).getEpochSecond(),"order_3");
        jedis.zadd(_KEY,Instant.now().plusSeconds(7).getEpochSecond(),"order_4");
        jedis.zadd(_KEY,Instant.now().plusSeconds(10).getEpochSecond(),"order_5");
        //开启定时任务队列
        doDelayQueue(jedis);
    }

    private static void doDelayQueue(Jedis jedis) throws InterruptedException {


        while(true){
            //当前时间
            Instant now = Instant.now();
            long lastSecond = now.plusSeconds(-1).getEpochSecond();
            long nowSecond = now.getEpochSecond();
            //查询当前执行的任务
            Set<String> data = jedis.zrangeByScore(_KEY, lastSecond, nowSecond);
            for (String  item: data
                 ) {
                //消费任务
                System.out.println("消费："+item);

            }
            //删除已经执行的任务
            jedis.zremrangeByScore(_KEY, lastSecond, nowSecond);
            Thread.sleep(1000);

        }
    }

}
