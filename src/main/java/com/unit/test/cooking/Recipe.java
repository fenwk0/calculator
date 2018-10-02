package com.unit.test.cooking;

public class Recipe {
    public Food getFood() {
        return food;
    }

    private Food food;

    public CookingBehaviour getCookingBehaviour() {
        return cookingBehaviour;
    }

    private CookingBehaviour cookingBehaviour;

    public Recipe(Food food, CookingBehaviour cookingBehaviour) {
        this.food = food;
        this.cookingBehaviour = cookingBehaviour;
    }


}
