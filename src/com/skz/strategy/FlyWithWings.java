package com.skz.strategy;

/**
 * @author: 宋开宗
 * @create: 2018-10-19 11:09
 **/
public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("鸭子正在飞...");
    }
}
