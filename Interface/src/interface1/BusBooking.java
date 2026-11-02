package interface1;

public class BusBooking implements IDiscount{
	@Override
	public int calculateDiscount(int amount, int rate) {
		int finalFare = amount - (amount*rate)/100 +10;
		return finalFare;
	}
	
	@Override
	public void calculateDiscountTax(int rate) {
		System.out.println("BusBooking.calculateDiscountTax()");
	}
}
