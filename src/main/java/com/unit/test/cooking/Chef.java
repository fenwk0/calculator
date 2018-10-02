package com.unit.test.cooking;

public class Chef {
    public String cook(Recipe recipe) {
        String result = "Chef.cook : " + recipe.getCookingBehaviour().getCookingMethod() +" an " + recipe.getFood().getName();
        return result;
    }
}
