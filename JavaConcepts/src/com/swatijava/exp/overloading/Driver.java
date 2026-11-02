package com.swatijava.exp.overloading;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login l1= new Login();
		l1.doLogin("swatihd12");
		l1.doLogin("swati3333@gmail.com", "3333");
		l1.doLogin("909123455", 3333);
	}

}
