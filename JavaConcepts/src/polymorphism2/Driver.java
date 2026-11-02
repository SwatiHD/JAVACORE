package polymorphism2;

class Employee{
	void markIn() {
		System.out.println("Employee.markIn()");
	}
}

class HRManager extends Employee{
	@Override
	void markIn() {
		System.out.println("HRManager.markIn()");
	}
}

public class Driver {

	public static void main(String[] args) {
	
	   
	//	h.markIn(); //error
	  Employee e = new HRManager();
	  // 1. during compilation it will check if  method exists in Employee class
	  //2. during runtime, it will call the method on actual object
	  e.markIn();
	  Employee e1 = new Employee();
	  e1.markIn();
	  
	  HRManager h=(HRManager) e;
	  h.markIn();
	}

}
