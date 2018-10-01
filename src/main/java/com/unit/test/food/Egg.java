package com.unit.test.food;

public class Egg implements Ingredient {
    boolean fried = false;

    public void fry() {
        fried = true;
    }

    public boolean isFried() {
        return fried;
    }
}
