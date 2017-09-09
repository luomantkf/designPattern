package com.pattern.state;

/**
 * Created by Administrator on 2017/6/12.
 */
public class Number {
    public Number(int number) {
        this.number = number;
    }

    private State currentState;

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void showNumber(){
        this.currentState.showNumber(this);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
