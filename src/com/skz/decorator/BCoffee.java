package com.skz.decorator;

/**
 * @author: 宋开宗
 * @create: 2018-11-06 10:18
 **/
public class BCoffee extends AbstractCoffee {

    public BCoffee() {
        name = "B";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
