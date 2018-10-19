package com.skz.strategy;

/**
 * @author: 宋开宗
 * @create: 2018-10-19 12:52
 **/
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("鸭子吱吱叫...");
    }
}
