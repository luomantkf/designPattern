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
            return "manager1�����request:"+num;
        }
        else if(num<10) {
            return "manager2�����request:"+num;
        }
        else if(num<20) {
            return "manager3�����request:"+num;
        }
        else if(num<30) {
            return "manager4�����request:"+num;
        }
        return null;
    }
}
