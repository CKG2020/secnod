package virtualredis.test;

import virtualredis.RedisServer;

import java.io.IOException;

public class TestRedis {
    public static void main(String[] args) {
        RedisServer redisServer = new RedisServer();
        try {
            redisServer.init(10000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
