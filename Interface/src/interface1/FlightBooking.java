package interface1;

public class FlightBooking implements IDiscount{
	@Override
	public int calculateDiscount(int amount, int rate) {
		int finalFare = amount - (amount*rate)/100;
		return finalFare;
	}
	
	@Override
	public void calculateDiscountTax(int rate) {
		System.out.println("FlightBooking.calculateDiscountTax()");
	}
}
