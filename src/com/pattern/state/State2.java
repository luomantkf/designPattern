package com.pattern.state;

/**
 * Created by Administrator on 2017/6/12.
 */
public class State2 implements State{
    @Override
    public void showNumber(Number number) {
        if(number.getNumber()<10){
            System.out.println("数字大于0小于10");
        }else {
            System.out.println("可以在动态的添加其他状态");
        }
    }
}
