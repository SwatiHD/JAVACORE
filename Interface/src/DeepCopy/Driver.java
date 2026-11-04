package DeepCopy;


public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address adr= new Address("1st main", "2nd Cross", "Bangalore");
		Employee emp = new Employee("Swati", "2345", adr);
		Employee clonedemp = (Employee) emp.clone();
		
		clonedemp.address.city = "Hyd";
		System.out.println("Driver.main()"+ emp.address.city);
		System.out.println("Driver.main2()"+clonedemp.address.city);

	}

}
