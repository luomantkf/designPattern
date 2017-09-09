package com.pattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/7/15.
 */
public class FlyweightFactory {
    private Map<String,Flyweight> flyweights;
    Flyweight flyweight=null;
    public FlyweightFactory() {
        flyweights=new HashMap<>();
    }

    public Flyweight getFlyweight(String str,User user){
        if(flyweights.get(str)!=null){
            return flyweights.get((str));
        }else{
           flyweight=new Flyweight() {
                @Override
                public void show() {
                    System.out.println("show:"+user.getName()+"_"+str);
                }
            };
            flyweights.put(str,flyweight);
            return flyweight;
        }
    }
}
