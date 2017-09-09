package com.pattern.iterator;



/**
 * 使用迭代模式：分离了聚合对象的遍历行为，抽象出来使用使用一个迭代器进行遍历(java中一般声明这个迭代器为一个私有的内部类，方便访问外部类的元素，同时不需要关系外部类的结构)
 */
public class Test {
    public static void main(String[] args) {
        Aggregate aggregate=new AggregateImp();
        aggregate.setDate("a");
        aggregate.setDate("b");
        aggregate.setDate("c");
        aggregate.setDate("d");
        System.out.println(aggregate.getSize());
        Iterator iterator=aggregate.createIterator();
        System.out.println(iterator.first());
        System.out.println(iterator.last());
        String next=null;
        while ((next=(String)iterator.next())!=null){
            System.out.println(next);
        }
    }
}
