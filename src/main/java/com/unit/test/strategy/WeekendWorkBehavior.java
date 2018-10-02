package com.unit.test.strategy;

public class WeekendWorkBehavior implements WorkBehavior {
    @Override
    public void work() {
        System.out.println("WeekendWorkBehavior.work");
    }
}
