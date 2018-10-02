package com.unit.test.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class Basic {

    @Mock
    private Person mockPerson;


    @Before
    public void setup() throws Exception {
        // This is the equivalent of mockPerson = mock(Person.class);
        // and any other instance variable.
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_Example_Mock(){
        when(mockPerson.getAge()).thenReturn(99).thenReturn(20);

        int result = mockPerson.getAge();
        System.out.println("result = " + result);
        assertEquals(99,result);

        int result2 = mockPerson.getAge();
        System.out.println("result = " + result2);
        assertEquals(20,result2);

        verify(mockPerson, never()).setAge();
        //verify(mockPerson, atLeastOnce()).setAge();
    }

    @Test
    public void test_Example_Mock_a() {
        when(mockPerson.getAge()).thenReturn(99).thenReturn(20);

        int result = mockPerson.getAge();
        System.out.println("result = " + result);
        assertEquals(99, result);
    }
}
