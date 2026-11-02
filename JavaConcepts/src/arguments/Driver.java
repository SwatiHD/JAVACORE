package arguments;

public class Driver {

	public static void main(String[] args) {
		ArgumentAccess1 a = new ArgumentAccess1();
		int newValue = a.multiply(3, 4);
		System.out.println("Driver.main()..."+newValue);
	}

}

class ArgumentAccess1 {
	public static int multiply(int a, int b) {
		int value=a * b;
		return value;
		//System.out.println("ArgumentAccess.multiply()..."+value);
	}
}
	
