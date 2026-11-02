package interfacedefault;

public class BusBooking implements IBooking {

	@Override
	public Booking book() {
		
		return null;
	}

	@Override
	public void cancelTicket() {
		System.out.println("BusBooking.cancelTicket()");
		
	}

	@Override
	public void checkStatus() {
		System.out.println("BusBooking.checkStatus()");
	}
	
	void printBusTicket(String path, String contents) {
		IBooking.printTicket("seat.com", "printingBus");
		System.out.println("BusBooking.printBusTicket()"+ path +contents);
		//200 lines
	}

}
