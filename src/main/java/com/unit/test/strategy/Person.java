package com.unit.test.strategy;

public class Person {

    private String surname;

    private WorkBehavior workBehavior;

    public Person(){
        workBehavior = new HomeWorkBehavior();
    }

    public void work() {
        workBehavior.work();
    }

    public void setWorkBehaviour(WorkBehavior workBehavior) {

        this.workBehavior = workBehavior;
    }
}
