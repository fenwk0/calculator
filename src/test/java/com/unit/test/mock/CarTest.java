package com.unit.test.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class CarTest {

    @Mock
    private Car mockCar;


    @Before
    public void setup() throws Exception {
        // This is the equivalent of mockPerson = mock(Person.class);
        // and any other instance variable.
        MockitoAnnotations.initMocks(this);
        when(mockCar.isEmpty()).thenReturn(true);
        when(mockCar.isMoving()).thenReturn(true);

    }

    @Test
    public void test_it_is_a_car() {
        System.out.println("CarTest.test_it_is_a_car");
        assertTrue(mockCar instanceof Car);
    }

    @Test
    public void test_the_car_needs_fuel() {
        System.out.println("CarTest.test_the_car_needs_fuel");
        assertTrue(mockCar.isEmpty());
    }

    @Test
    public void test_the_car_is_moving() {
        System.out.println("CarTest.test_the_car_is_moving");
        assertTrue(mockCar.isMoving());
    }

}
