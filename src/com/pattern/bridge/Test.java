package com.pattern.bridge;

/**
 * 使用桥接模式：将抽象部分与实现部分进行分离，是他们可以独立的变化（通常使用聚合和合成来实现）,消除了继承之间的强耦合，一般是适用于从多个角度是思考一个类
 */
public class Test {
    public static void main(String[] args) {
        PhoneBrand phoneBrand=new PhoneBrandA();
        phoneBrand.listSoft();
    }
}
