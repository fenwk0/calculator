package com.unit.test.fixtures;

import org.junit.*;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;

public class TestFixture2 {

    private static ArrayList<String> collection;

    @BeforeClass
    public static void one_Time_Setup(){
        System.out.println("BeforeClass");
    }

    @Before
    public  void before_Every_Test(){
        System.out.println("Before");
        collection = new ArrayList<String>();
    }

    @Test
    public void test_Collection_Is_Empty() throws Exception {
        assertTrue(collection.isEmpty());
        System.out.println("TestFixture2.test_Collection_Is_Empty");
    }

    @After
    public  void after_Every_Test(){
        System.out.println("After");
        collection.clear();
    }
    @AfterClass
    public static void one_Time_Tear_Down(){
        System.out.println("AfterClass");
    }
}
