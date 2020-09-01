package com.ckg.timer.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPubSub;

public class TaskExample {
    public  static final   String  _TOPIC="_keyevent@0_:expired";

    public static void main(String[] args) {
        Jedis jedis = JedisUtils.getJedis();
        //执行定时任务
         doTask(jedis);
    }
    //订阅过期消息，执行定时任务
    public static  void  doTask(Jedis jedis){
        //订阅过期消息
        jedis.psubscribe(new JedisPubSub() {
            @Override
            public void onPMessage(String pattern, String channel, String message) {
                //接收到消息，执行定时任务
                System.out.println("收到消息："+message);
            }
        },_TOPIC);
    }
}
