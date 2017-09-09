package com.pattern.facade;

/**
 *使用外观者模式，很好体现了依赖倒转和迪米特法则，保证了系统的低耦合
 * 外观类定义一个更高层次的接口来为子系统的一组接口提供组织使用。
 */
public class FacadeTest {

    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.methodA();
        facade.methodB();
    }

}
