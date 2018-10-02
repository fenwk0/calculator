package com.unit.test.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class CarTest {

    @Mock
    private Car mockCar;


    @Before
    public void setup() throws Exception {
        // This is the equivalent of mockPerson = mock(Person.class);
        // and any other instance variable.
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_it_is_a_car() {
        System.out.println("CarTest.test_it_is_a_car");
        assertTrue(mockCar instanceof Car);
    }
}
