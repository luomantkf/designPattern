package com.pattern.iterator;

/**
 * 聚合对象
 */
public interface Aggregate {

    Iterator createIterator();
    void setDate(String str);
    int getSize();

}
