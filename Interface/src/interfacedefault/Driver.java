package interfacedefault;

public class Driver {

	public static void main(String[] args) {
		TrainBooking booking = new TrainBooking();
		booking.autoUpgrade();

		Booking b1 = booking.book();
		
		String status = b1.getBookingId();
		System.out.println("STATUS: "+ status);
		
	    BusBooking bus1 = new BusBooking();
	    bus1.printBusTicket("222","dddd");
	}

}
