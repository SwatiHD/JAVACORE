package interface1;

public class Driver {

	public static void main(String[] args) {
		FlightBooking f1= new FlightBooking();
		f1.calculateDiscount(1000, 8);
		f1.calculateDiscountTax(2);
		
		
		BusBooking b1 = new BusBooking();
		b1.calculateDiscount(3000, 5);
		
		
		IDiscount d1 = new FlightBooking();
		int result = d1.calculateDiscount(2000, 4);
		System.out.println("caldis FLight..."+ f1.calculateDiscount(1000, 8));
		System.out.println("caldis Bus..."+ b1.calculateDiscount(3000, 5));
		
		System.out.println("Flight.main()..."+ result);
	}

}
