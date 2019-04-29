package com.example.redis.entity;

import java.io.Serializable;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/4/29 10:42
 * @description: 车辆
 */
public class Car implements Serializable{
    private String name;
    private int price;
    private int speed;
    private int load;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                ", load=" + load +
                '}';
    }
}
