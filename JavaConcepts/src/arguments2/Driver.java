package arguments2;

public class Driver {

	public static void main(String[] args) {
		ArgsInstanceGetter a = new ArgsInstanceGetter();
		a.multiply(2, 1);
		System.out.println("Driver.main()"+ a.getValue());
	}

}
