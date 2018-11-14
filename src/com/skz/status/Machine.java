package com.skz.status;

/**
 * @author: 宋开宗
 * @create: 2018-11-14 16:37
 **/
public class Machine {

    State state;
    HasInsertState hasInsertState;
    int count;

    public Machine(int count) {
        hasInsertState = new HasInsertState(this);
        this.count = count;
        if (count > 0) {
            this.state = new ReadyInsertState();
        }
    }

    public void insert() {
        state.insert();
    }

    public void setState(State state) {
        this.state = state;
    }

    public HasInsertState getHasInsertState() {
        return hasInsertState;
    }

    public void setHasInsertState(HasInsertState hasInsertState) {
        this.hasInsertState = hasInsertState;
    }
}
