package org.redis.pubsub;

import redis.clients.jedis.Jedis;

public class TestPub{
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.137.18", 6379);
		jedis.connect();
		jedis.publish("news.test2", "jhhjhh1");
		jedis.disconnect();
	}

}
