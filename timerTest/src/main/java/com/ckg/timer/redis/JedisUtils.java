package com.ckg.timer.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

public class JedisUtils {
    private static JedisPool pool;
    static {
        //读取配置文件
        ResourceBundle resourceBundle = ResourceBundle.getBundle("config.properties");
        String host = resourceBundle.getString("host");
        //获取端口号
        int port = Integer.parseInt(resourceBundle.getString("port"));

        //获取最大连接数
        int maxTotal = Integer.parseInt(resourceBundle.getString("maxTotal"));
        //获取闲时连接数
        int maxIdle = Integer.parseInt(resourceBundle.getString("maxIdle"));

        //创建连接池配置对象
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxTotal(maxTotal);

        //创建连接池对象
        pool = new JedisPool(jedisPoolConfig, host, port);
    }
    //创建方法  连接池对象
    public static Jedis getJedis(){
        return pool.getResource();
    }



    //释放资源
    public static void close(Jedis jedis){
        if(jedis!=null){
            jedis.close();
        }
    }

    private static void close(JedisPool pool){
        if (pool!=null){
            pool.close();
        }
    }




}

