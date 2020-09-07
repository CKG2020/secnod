import org.junit.Test;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;




public class MyRedis {

    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public  void  redisTest(){

        redisTemplate.opsForValue().set("name","ckg");
        String  name = (String) redisTemplate.opsForValue().get("name");
        System.out.println(name);




        redisTemplate.delete("name");


       redisTemplate.opsForValue().set("name","cgr");

        name = (String) redisTemplate.opsForValue().get("name");

        System.out.println(name);
    }


}
