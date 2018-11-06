package com.skz.decorator;

/**
 * @author: 宋开宗
 * @create: 2018-11-06 10:18
 **/
public class ACofffee extends AbstractCoffee {
    public ACofffee() {
        name = "A";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
