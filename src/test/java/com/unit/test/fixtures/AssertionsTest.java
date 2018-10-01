package com.unit.test.fixtures;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {

    @Test(timeout = 1000)
    public void test() {

        String string1 = new String("abc;");
        String string2 = new String("abc;");
        String string3 = null;
        String string4 = "abc";
        String string5 = "abc";
        String string6 = new String("abc");

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};

        assertEquals(string1, string2);
        assertTrue(val1 < val2);
        assertNotNull(string1);
        assertNull(string3);
    }

}

