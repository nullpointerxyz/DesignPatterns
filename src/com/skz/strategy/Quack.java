package com.skz.strategy;

/**
 * @author: 宋开宗
 * @create: 2018-10-19 12:51
 **/
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("鸭子呱呱叫...");
    }
}
