package interfacedefault;

public class TrainBooking implements IBooking{

	@Override
	public Booking book() {
		Booking booking = new Booking();
		booking.setBookingId("RTE898");
		booking.setStatus("Cancelled");
		System.out.println("TrainBooking.book()");
		return booking;
	}

	@Override
	public void cancelTicket() {
		System.out.println("TrainBooking.cancelTicket()");
		
	}

	@Override
	public void checkStatus() {
		System.out.println("TrainBooking.checkStatus()");
		
	}
	@Override
	public void autoUpgrade() {
		System.out.println("BusBooking.autoUpgrade()");
	}
	void printTrainTicket(String path, String contents) {
		IBooking.printTicket("ruby.com", "printing");
		//200 lines
	}
	
}
