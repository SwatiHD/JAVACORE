package com.swatijava.exp.overloading;

public class Login {
	public void doLogin(String mobile, int otp) {
		System.out.println("Login.doLogin()");
	}
	
	public String doLogin(String email, String password) {
		System.out.println("Login.doLogin()...email and pass");
		return "done";
	}
	
	public void doLogin(String gmail) {
		System.out.println("Login.doLogin()...gmail");
	}
}
