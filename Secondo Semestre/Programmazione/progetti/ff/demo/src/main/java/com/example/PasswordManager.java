package com.example;

public class PasswordManager {

	private String password = "admin19"; // hard-coded (and too simple) password...
    
	protected boolean checkPassword(String pwd) {
		
		return this.password.equals(pwd);
	}


}
