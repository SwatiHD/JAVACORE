package polymorphism3;

public class Client {

	public static void main(String[] args) {
		
		AirlineProcessor airlineProcessor = new AirlineProcessor();
		
	// for	#user1, selects Customer as Regular Customer
		RegularCust regcust = new RegularCust();
		
		airlineProcessor.processCustomer(regcust);
		
		// for	#user2, selects Customer as Frequent Customer
		FrequentCust freqcust = new FrequentCust();
		airlineProcessor.processCustomer(freqcust);
	}

}
