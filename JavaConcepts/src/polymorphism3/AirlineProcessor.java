package polymorphism3;

public class AirlineProcessor {
	public void processCustomer(Customer customer) {
		customer.doSelect(); //calls FrequentCust method during compile time ,, Customer customer = new FrequentCust();//polymorphism is achieved here
	}
}
