package com.unit.test.food;

public class Chef {
    public void fry(Egg egg) {
        egg.fry();
    }

    public void fry(Ingredient ingredient) {
        if(ingredient instanceof Egg ){
            ((Egg)ingredient).fry();
        }
    }
}
