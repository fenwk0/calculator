package com.unit.test.food;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class BreakfastTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void test_Eggs_Is_Fried() throws Exception {
        System.out.println("BreakfastTest.test_Eggs_Is_Fried");

        // com.unit.test.food.Egg
        // Fry
        // Check for state change
        Breakfast breakfast = new Breakfast();
        Egg egg = new Egg();
        egg.fry();
        assertTrue(egg.isFried());
    }

    @Test
    public void test_Chef_Can_Fry_An_Egg() throws Exception {
        System.out.println("BreakfastTest.test_Chef_Can_Fry_An_Egg");

        // com.unit.test.food.Egg
        // Fry
        // Check for state change
        Breakfast breakfast = new Breakfast();
        Egg egg = new Egg();
        Chef chef = new Chef();
        chef.fry(egg);

        assertTrue(egg.isFried());
    }

    @AfterEach
    void tearDown() {
    }
}