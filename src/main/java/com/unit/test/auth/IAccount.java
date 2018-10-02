package com.unit.test.auth;

public interface IAccount {
	void setLoggedIn(boolean value);
	boolean passwordMatches(String candidate);
	void setRevoked(boolean b);
	boolean isLoggedIn();
}
