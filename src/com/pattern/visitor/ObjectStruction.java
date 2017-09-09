package com.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/15.
 */
public class ObjectStruction {

    private List<Person> persons=new ArrayList<>();
    public void addPerson(Person person){
        persons.add(person);
    }
    void dispatch(Visitor visitor){
        for(Person person:persons){
            person.accept(visitor);
        }
    }
}
