package Interfaces;

public class Driver {

	public static void main(String[] args) {
		IAccount acc = (name, addr, amt)-> {
			System.out.println("Driver.main()"+name+addr+amt);
			return "Acct opened";
		};
		String result = acc.openAccount("Swati", "BTM layout", 110);
		System.out.println("Driver.main()........2 "+ result);
	}

}
