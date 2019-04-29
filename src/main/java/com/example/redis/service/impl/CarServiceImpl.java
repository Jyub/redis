package com.example.redis.service.impl;

import com.example.redis.entity.Car;
import com.example.redis.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * {@link CarService}
 * @version v1.0
 * @author: yubiao
 * @date: 2019/4/29 14:13
 * @description: car 的实现类
 */
@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Override
    public void save(Car car) {
        redisTemplate.opsForValue().set(car.getName(),car);
    }

    @Override
    public Car get(String name) {
        return (Car)redisTemplate.opsForValue().get(name);
    }
}
