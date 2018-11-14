package com.skz.status;

/**
 * @author: 宋开宗
 * @create: 2018-11-14 16:46
 **/
public class ReadyInsertState implements State {
    @Override
    public void insert() {
        System.out.println("你已经投币，可以选择出货了");
    }

    @Override
    public void deliver() {
        System.out.println("你还未投币，请先投币");
    }

    @Override
    public void eject() {
        System.out.println("你还未投币，不可退钱");
    }
}
