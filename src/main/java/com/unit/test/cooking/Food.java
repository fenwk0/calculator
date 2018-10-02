package com.unit.test.cooking;

public interface Food {
    void setCookingMethod(CookingBehaviour cookingBehaviour);
    CookingBehaviour getCookingMethod();

    String getName();
}
