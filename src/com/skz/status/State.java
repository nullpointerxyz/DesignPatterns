package com.skz.status;

/**
 * @author: 宋开宗
 * @create: 2018-11-14 16:37
 **/
public interface State {
    /**
     * 投币
     */
    void insert();

    /**
     * 出货
     */
    void deliver();

    /**
     * 退款
     */
    void eject();
}
