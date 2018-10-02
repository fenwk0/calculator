package com.unit.test.strategy;

public class OfficeWorkBehavior implements WorkBehavior {

    @Override
    public void work() {
        System.out.println("OfficeWorkBehavior.work");
    }
}
