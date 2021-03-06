package com.unit.test.numbers;

import com.unit.test.numbers.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    public void test_addition() {
        System.out.println("com.unit.test.numbers.CalculatorTest.test_addition");
        int numberUnderTest = 4;
        assertThat(Calculator.add(2, 2), is(numberUnderTest));
    }

    @Test
    public void test_subtraction() {
        System.out.println("com.unit.test.numbers.CalculatorTest.test_subtraction");
        int numberUnderTest = 4;
        assertThat(Calculator.sub(6, 2), is(numberUnderTest));
    }

    @Test
    public void test_multiply() {
        System.out.println("com.unit.test.numbers.CalculatorTest.test_multiply");
        double numberUnderTest = 12.0;
        try {
            assertThat(Calculator.mul(6.0, 2.0), is(numberUnderTest));
        } catch (Exception e) {
            Assert.fail("Test failed : " + e.getMessage());
        }
    }


    @Test
    public void test_divide() {
        System.out.println("com.unit.test.numbers.CalculatorTest.test_divide");
        double numberUnderTest = 12;
        try {
            assertThat(Calculator.div(24, 2), is(numberUnderTest));
        } catch (Exception e) {
            Assert.fail("Test failed : " + e.getMessage());
        }
    }

    //@Test(expected = ArithmeticException.class)
    @Test
    public void test_divide_by_zero() {
        System.out.println("com.unit.test.numbers.CalculatorTest.test_divide_by_zero");
        double result = Calculator.div(24, 0);
        assertThat( Double.isInfinite(result), is(true));
    }

    @AfterEach
    void tearDown() {
    }
}