package com.skz.status;

/**
 * @author: 宋开宗
 * @create: 2018-11-14 16:47
 **/
public class HasInsertState implements State {
    Machine machine;

    public HasInsertState(Machine machine) {
        this.machine = machine;
    }

    @Override
    public void insert() {
        System.out.println("已经投币了，不需要再投币了");
    }

    @Override
    public void deliver() {
        System.out.println("好的，正在出货");
    }

    @Override
    public void eject() {
        System.out.println("好的，正在退款");
    }
}
