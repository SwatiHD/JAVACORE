package ShallowClone;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address adr= new Address("1st main", "2nd Cross", "Bangalore");
		Employee emp = new Employee("Swati", "2345", adr);
		Employee emp1 = (Employee) emp.clone();
		
		emp1.address.city = "Hyd";
		System.out.println("Driver.main()"+ emp.address.city);
		System.out.println("Driver.main2()"+emp1.address.city);

	}

}
