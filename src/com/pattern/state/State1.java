package com.pattern.state;

/**
 * Created by Administrator on 2017/6/12.
 */
public class State1 implements State {
    @Override
    public void showNumber(Number number) {
        if(number.getNumber()<0){
            System.out.println("输入的数字小于0");
        }else{
            number.setCurrentState(new State2());
            number.showNumber();
        }
    }
}
