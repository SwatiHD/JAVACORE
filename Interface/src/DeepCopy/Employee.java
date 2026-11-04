package DeepCopy;

public class Employee implements Cloneable //level-1
{
	String name;
	String empCode;
	Address address; // Employee HAS-A address of Address obj
	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee employee = (Employee) super.clone();
		employee.address = (Address) address.clone();	
		return employee;
	}
	
}
