package com.ckg.timer.redis;


import redis.clients.jedis.Jedis;

public class JedisUtilsTest {
    public static void main(String[] args) {
        Jedis jedis = JedisUtils.getJedis();
        System.out.println(jedis.get("name"));

        jedis.set("ege","23");
        System.out.println(jedis.get("ege")+"ege");
        JedisUtils.close(jedis);

    }
}

