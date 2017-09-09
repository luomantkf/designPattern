package com.pattern.state;

/**
 * 使用状态模式将特定状态的具体行为进行了封装，消除了庞大的分支判断，减少更改状态时的相互依赖
 */
public class Test {
    public static void main(String[] args) {
        Number number=new Number(12);
        State state=new State1();
        number.setCurrentState(state);
        number.showNumber();

    }
}
