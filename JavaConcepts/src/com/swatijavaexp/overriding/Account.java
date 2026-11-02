package com.swatijavaexp.overriding;

public class Account {
	
	public void openAccount(String name, String address) {
		int balance= 1000;
		System.out.println("Account.openAccount()");
	}
}

class SavingsAccount extends Account{
	@Override
	public void openAccount(String firstname, String lastname) {
		int balance= 3000;
		System.out.println("Account.SavingsAccount.OpenAccount()");
	}
}



