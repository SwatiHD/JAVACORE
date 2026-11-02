package polymorphism;

class Employee{
	void registerAcct() {
		System.out.println("Employee.registerAcct()");
	}
}

class FinanceEmp extends Employee{
	public void accountMgt() {
		System.out.println("FinanceEmp.accountMgt()");
	}
}

public class User {

	public static void main(String[] args) {
		Employee e = new Employee(); // parent class refering parent class obj
		e.registerAcct();
		
		
		FinanceEmp f= new FinanceEmp();
		f.accountMgt();
		f.registerAcct();
		
		
		Employee e1 = new FinanceEmp();// parent class referring to child class obj -- up casting
		e1.registerAcct();
		FinanceEmp f1=(FinanceEmp) e1;// child class is referring to parent class obj -- down casting
		f1.accountMgt();
		f1.registerAcct();
	}

}
