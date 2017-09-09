package com.pattern.iterator;

/**
 * Created by Administrator on 2017/7/14.
 */
public interface Iterator {

    Object first();
    Object next();
    Object last();
    boolean isDone();
    Object currentItem();

}
