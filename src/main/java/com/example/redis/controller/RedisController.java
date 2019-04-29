package com.example.redis.controller;

import com.example.redis.entity.Car;
import com.example.redis.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/4/29 9:56
 * @description: controller
 */
@RestController
@RequestMapping(value="redis")
public class RedisController {

    @Autowired
    private CarService carService;

    @PostMapping(value = "save",name = "保存")
    public Car save(@RequestBody Car car){
        try{
            carService.save(car);
            return car;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping(value = "get/{name}",name = "获取")
    public Car get(@PathVariable String name){
        try {
           return carService.get(name);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
