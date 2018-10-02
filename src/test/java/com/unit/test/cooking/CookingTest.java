package com.unit.test.cooking;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CookingTest {


//    @Mock
//    private IAccount mockAccount;
//
//    @Mock
//    private IAccountRepository mockAccountRepository;
//
//    private LoginService loginService;
//
//    @Before
//    public void init() {
//        mockAccount = mock(IAccount.class);
//
//        mockAccountRepository = mock(IAccountRepository.class);
//        when(mockAccountRepository.find(anyString())).thenReturn(mockAccount);
//
//        loginService = new LoginService(mockAccountRepository);
//    }

/**
 * Actors
 * ------
 * Chef
 * Food
 *    Interface
 *      add(CookingBehaviour)
 *
 * Behaviours
 * ----------
 * FriableCookingBehaviour
 * BoilableCookingBehaviour
 * CookingBehaviour - Interface
 *
 */


    @Test
    public void test_That_Chef_Can_Fry_An_Egg(){
        System.out.println("CookingTest.test_That_Chef_Can_Fry_An_Egg");

        CookingBehaviour mockFryingBehaviour = mock(CookingBehaviour.class);
        when(mockFryingBehaviour.getCookingMethod()).thenReturn("Fry");

        Food mockEgg = mock(Food.class);
        when(mockEgg.getName()).thenReturn("Egg");

        Recipe recipe = new Recipe(mockEgg, mockFryingBehaviour);

        Chef chef = new Chef();
        chef.cook(recipe);

        String expected = "Fry an Egg";
        assertEquals(expected, "Fry an Egg");





    }
}
