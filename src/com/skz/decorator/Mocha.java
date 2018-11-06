package com.skz.decorator;

/**
 * @author: 宋开宗
 * @create: 2018-11-06 10:19
 **/
public class Mocha extends AbstractCoffee {
    private AbstractCoffee abstractCoffee;

    public Mocha(AbstractCoffee abstractCoffee) {
        this.abstractCoffee = abstractCoffee;
    }

    @Override
    public double cost() {
        return abstractCoffee.cost() + 0.2;
    }

    @Override
    public String getName() {
        return abstractCoffee.getName() + ",Mocha";
    }
}
