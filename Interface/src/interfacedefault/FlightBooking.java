package interfacedefault;

public class FlightBooking implements IBooking{

	@Override
	public Booking book() {
		Booking booking = new Booking();
		booking.setBookingId("UTX898");
		booking.setStatus("Confirmed");
		return booking;
	}

	@Override
	public void cancelTicket() {
		System.out.println("FlightBooking.cancelTicket()");
		
	}

	@Override
	public void checkStatus() {
	System.out.println("FlightBooking.checkStatus()");
	}
	void printFlightTicket(String path, String conntents) {
		IBooking.printTicket("pearl.com", "printingflight");
		//200 lines
	}

}
