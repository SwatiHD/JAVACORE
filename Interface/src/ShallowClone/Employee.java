package ShallowClone;

public class Employee implements Cloneable  //level-1
{
	String name;
	String empCode;
	public Address address; // Employee HAS_A address of Address obj
	
	
	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
