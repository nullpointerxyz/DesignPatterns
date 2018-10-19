package com.skz.strategy;

/**
 * @author: 宋开宗
 * @create: 2018-10-19 11:06
 **/
public abstract class Duck {
    private QuackBehaviour quackBehaviour;
    private FlyBehaviour flyBehaviour;

    /**
     * 鸭子会游泳
     */
    public void swim() {
        System.out.println("鸭子正在游泳...");
    }


    /**
     * 鸭子外观各不相同，由实现类重写
     */
    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
