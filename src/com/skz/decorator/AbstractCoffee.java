package com.skz.decorator;

/**
 * @author: 宋开宗
 * @create: 2018-11-06 10:16
 **/
public abstract class AbstractCoffee {
    String name = "unknown coffee";

    public String getName() {
        return name;
    }

    public abstract double cost();
}
