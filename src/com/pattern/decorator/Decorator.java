package com.pattern.decorator;

/**
 * Created by Administrator on 2017/5/30.
 */
public class Decorator extends Person {

    private Person person;



    public void setPerson(Person person){
        this.person=person;
    }

    @Override
    public void show() {
        if(person!=null){
            person.show();
        }
    }
}
