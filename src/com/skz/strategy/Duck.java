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


    /**
     * 动态绑定叫行为
     *
     * @param quackBehaviour
     */
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    /**
     * 动态绑定飞行为
     *
     * @param flyBehaviour
     */
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    /**
     * 通用飞行为
     */
    public void performFly() {
        flyBehaviour.fly();
    }

    /**
     * 通用叫行为
     */
    public void performQuack() {
        quackBehaviour.quack();
    }
}
