package MarkerInterface;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account acc= new Account("Swati", "BTM LAYOUT", "232235584");
		
		Account clonedObject = (Account) acc.clone();
		
		System.out.println("Driver.main()"+clonedObject.accNo);
		
		if(acc instanceof Cloneable) {
			System.out.println("true");
			
		}else {
			System.out.println("false");
		}

	}

}
