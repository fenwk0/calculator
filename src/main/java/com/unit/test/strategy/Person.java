package com.unit.test.strategy;

public class Person {

    private String surname;

    private WorkBehavior workBehavior;

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public Boolean isAdult() {
        boolean adult = false;
        if(age >= 18) {
            adult = true;
        }
        return adult;
    }

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
