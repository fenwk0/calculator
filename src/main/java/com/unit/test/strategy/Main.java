package com.unit.test.strategy;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        // Work according to a current behaviour
        // added during construction

        person.work();
        person.setWorkBehaviour( new OfficeWorkBehavior() );
        person.work();
        person.setWorkBehaviour( new WeekendWorkBehavior() );
        person.work();

    }
}
