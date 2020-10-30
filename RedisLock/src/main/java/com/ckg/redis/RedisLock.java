package com.ckg.redis;

import io.lettuce.core.RedisClient;
import io.lettuce.core.SetArgs;
import io.lettuce.core.StatefulRedisConnectionImpl;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import jdk.management.resource.ResourceId;
import org.slf4j.LoggerFactory;

import java.util.UUID;
import java.util.logging.Logger;

public class RedisLock {

    private  static  final org.slf4j.Logger LOGGER=  LoggerFactory.getLogger(RedisLock.class);
    private  static RedisClient  redisClient;
    private  static StatefulRedisConnection<String,String> connection;
    private  static    RedisCommands<String,String>  sync;


      static{
        redisClient=RedisClient.create("redis://localhost");
        connection=redisClient.connect();
          sync = connection.sync();
        LOGGER.info("redis init successfully");
      }



    private  static  final String PX="PX";
    //PX millisecounds:设置键的过期时间为millisecounds 毫秒


    private static final String EX = "EX";
    // EX seconds:设置键的过期时间为second秒



    private static final String NX = "NX";
    // NX:只在键不存在的时候,才对键进行设置操作


    public static  final String OK="OK";
//    调用set后的返回值

    public static final String NIL="NIL";

    public static final long  TIMEOUT=100;
    //默认请求锁的超时时间(ms 毫秒)


    private static  final int EXPIRE=100;
//    锁对应的key


    public  String lockKey;

    private   String  value;

    private int expireTime=EXPIRE;

    private  long  timeout=TIMEOUT;

    private boolean locked =false;




    public RedisLock(String lockKey){
        this.lockKey=lockKey;
    }
    public RedisLock(String lockKey,int expireTime){
        this.lockKey=lockKey;
        this.expireTime=expireTime;
    }

    public RedisLock(String lockKey,int expireTime,long timeout){
        this.lockKey=lockKey;
        this.expireTime=expireTime;
        this.timeout=timeout;
    }




    public boolean lock() {
        value=UUID.randomUUID().toString();
//        value="xxxxxx";
        String set=set();

        if (OK.equalsIgnoreCase(set)){
            locked=true;
        }

        return  locked;

    }
    //尝试加锁而非尝试获取锁
    public boolean tryLock() {
        value = UUID.randomUUID().toString();
        long timeout_ = timeout * 600;
        long currentTimeMillis = System.currentTimeMillis();
        while (System.currentTimeMillis() - currentTimeMillis < timeout) {
            String set = set();
            if (OK.equalsIgnoreCase(set)) {
                locked = true;

                return true;
            }
            //中断式轮训 不要一直来set我的key
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return locked;
    }



    private String set() {
        SetArgs setArgs = new SetArgs();
        setArgs.nx();
        setArgs.ex(expireTime);
       return sync.set(lockKey, value, setArgs);

    }


    public boolean unlock() {
        if (locked){
            String s = sync.get(lockKey);
            if (!NIL.equalsIgnoreCase(s))  {
                destory();
                locked=true;
                return locked;
            }

            else {
                locked=false;
                return locked;
            }
        }
        return false;
    }



    public void  destory() {

        if (null!=lockKey){
            sync.del(lockKey);
        }

    }

    public static void main(String[] args) {
        RedisLock redisLock = new RedisLock("xxx");
        boolean lock = redisLock.lock();
        System.out.println(lock);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boolean b = redisLock.unlock();
        System.out.println(b);


//        System.out.println(lock);

    }

}

