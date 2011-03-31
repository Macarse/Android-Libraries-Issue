package com.poc.login;

public class Login {

	public boolean login(String user, String passwd) {
		if ( user.equals("admin") && passwd.equals("admin") ) {
			return true;
		} else {
			return false;
		}
	}
}
