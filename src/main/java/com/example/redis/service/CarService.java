package com.example.redis.service;

import com.example.redis.entity.Car;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/4/29 14:10
 * @description: car service
 */
@NoRepositoryBean
public interface CarService {

    void save(Car car);

    Car get(String name);
}
