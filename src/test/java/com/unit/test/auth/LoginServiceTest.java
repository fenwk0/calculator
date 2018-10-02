package com.unit.test.auth;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class LoginServiceTest {
    @Mock
    private IAccount mockAccount;

    @Mock
    private IAccountRepository mockAccountRepository;

    private LoginService loginService;

    @Before
    public void init() {
        mockAccount = mock(IAccount.class);

        mockAccountRepository = mock(IAccountRepository.class);
        when(mockAccountRepository.find(anyString())).thenReturn(mockAccount);

        loginService = new LoginService(mockAccountRepository);
    }

    private void willPasswordMatch(boolean value) {
        when(mockAccount.passwordMatches(anyString())).thenReturn(value);
    }

    @Test
    public void itShouldSetAccountToLoggedInWhenPasswordMatches() {
        willPasswordMatch(true);
        loginService.login("brett", "password");
        verify(mockAccount, times(1)).setLoggedIn(true);
    }

    @Test
    public void itShouldNiotSetAccountLoggedInIfPasswordDoesNotMatch() {
        willPasswordMatch(false);
        loginService.login("brett", "password");
        verify(mockAccount, never()).setLoggedIn(true);
    }

    @Test(expected = AccountLoginLimitReachedException.class)
    public void itShouldNowAllowConcurrentLogins() {
        willPasswordMatch(true);
        when(mockAccount.isLoggedIn()).thenReturn(true);
        loginService.login("brett", "password");
    }

    @Test
    public void test_account_revoked() {
        System.out.println("LoginServiceTest.test_account_revoked");
        willPasswordMatch(false);

        loginService.login("brett", "password");
        loginService.login("brett", "password");
        loginService.login("brett", "password");

        verify(mockAccount, atLeastOnce()).setRevoked(true);
    }

}