package com.unit.test.strategy;

public class HomeWorkBehavior implements WorkBehavior {
    @Override
    public void work() {
        System.out.println("HomeWorkBehavior.work");
    }
}
