package com.example.redis;


import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/4/29 14:14
 * @description: 缓存配置
 */
@Configuration
@EnableCaching
public class RedisConfiguration {

    @Bean
    public CacheManager simpleCacheManager(){
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        Cache cache = new ConcurrentMapCache("cars");
        cacheManager.setCaches(Arrays.asList(cache));
        return cacheManager;
    }
}
