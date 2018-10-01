package com.unit.test;

public class Calculator {
    public static int add(int i, int i1) {
        return i+i1;
    }

    public static int sub(int i, int i1) {
        return i-i1;
    }

    public static double mul(double v, double v1)  {
        return v * v1;
    }

    /**
     * Double precision division returns infinity and does not throw Divide By Zero (unbeleivably!)
     * @param v
     * @param v1
     * @return result
     * @throws ArithmeticException
     */
    public static double div(double v, double v1)  {
        System.out.print("com.unit.test.Calculator.div");
        System.out.print(": {v = " + v);
        System.out.print(", v1 = " + v1);
        double result = v/v1;
        System.out.println(", result = " + result +"}");
        return result;
    }
}
