package com.poc.login;

import junit.framework.Assert;

import org.junit.Test;

public class LoginTest {

	@Test
	public void LoginShouldReturnTrueWhenCredentialsAreOk() {
		Login login = new Login();
		Assert.assertEquals(true, login.login("admin", "admin"));
	}

	public void LoginShouldReturnFalseWhenCredentialsAreNotOk() {
		Login login = new Login();
		Assert.assertEquals(true, login.login("user", "wrongPass"));
	}
}
