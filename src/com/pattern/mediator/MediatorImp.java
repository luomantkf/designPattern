package com.pattern.mediator;

/**
 * Created by Administrator on 2017/7/15.
 */
public class MediatorImp implements Mediator {

    private ColleagueImp colleagueImp;
    private ColleagueImp1 colleagueImp1;

    public MediatorImp() {
        colleagueImp=new ColleagueImp(this);
        colleagueImp1=new ColleagueImp1(this);
    }

    @Override
    public void sendMsg(String str, Colleague colleague) {
        if(colleague instanceof ColleagueImp){
            colleagueImp1.notify(str);
        }else{
        colleagueImp.notify(str);
    }
    }
}
