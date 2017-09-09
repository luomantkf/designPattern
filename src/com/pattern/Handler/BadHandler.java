package com.pattern.Handler;

/**
 * Created by Administrator on 2017/5/19.
 */
public class BadHandler {
    int num=0;
    public void setRequest(int num){
        this.num=num;
    }
    public String getResult(){
        if(num<0){
            return "manager1处理的request:"+num;
        }
        else if(num<10) {
            return "manager2处理的request:"+num;
        }
        else if(num<20) {
            return "manager3处理的request:"+num;
        }
        else if(num<30) {
            return "manager4处理的request:"+num;
        }
        return null;
    }
}
