package com.pattern.bridge;

import java.util.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/14.
 */
public abstract class PhoneBrand {

    private List<PhoneSoft> softs=new ArrayList<PhoneSoft>();
    public void addSoft(PhoneSoft soft){
        softs.add(soft);
    }
    abstract void run();

    public void listSoft(){
        Iterator<PhoneSoft> iterator=softs.iterator();
        while (iterator.hasNext()){
            PhoneSoft soft=iterator.next();
            soft.run();
        }
    }
}
