package com.goldcard.mybatis_demo.main;

import com.goldcard.mybatis_demo.config.RedisConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

public class RedisTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RedisConfig.class);
        RedisTemplate redisTemplate = ctx.getBean(RedisTemplate.class);
        redisTemplate.opsForValue().set("test","test");
        redisTemplate.opsForHash().put("ceshi","name","zs");
    }
}
