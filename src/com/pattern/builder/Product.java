package com.pattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/7.
 */
public class Product {

    List<String> parts=new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }
    public void show(){
        for(String part:parts){
            System.out.println(part);
        }
    }


}
