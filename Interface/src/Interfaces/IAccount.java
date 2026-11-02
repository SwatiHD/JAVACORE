package Interfaces;

@FunctionalInterface
public interface IAccount{
	String openAccount(String name, String address, int amount);
	
	default void addAmount() {
		
	}
}
