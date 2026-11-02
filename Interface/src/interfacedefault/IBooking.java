package interfacedefault;

public interface IBooking {
	public abstract Booking book();
	public abstract void cancelTicket();
	public abstract void checkStatus(); //must be implemented in all classes
	
	
	//optional
	public default void autoUpgrade() {
		// 200 lines (connect to DB , check status, upgrade)
		connectDB();
	}//applies only to some of the classes
	
	public default void sendNotification() {
		// 200 lines (connect to db and use user details)
		connectDB();
	}
	
	private void connectDB() {
		System.out.println("IBooking.connectDB()");
	}
	public static void printTicket(String path, String contents) {
		//connectDB();
		System.out.println("IBooking.printTicket()......"+path +contents);
	}// common for all classes
	
}
