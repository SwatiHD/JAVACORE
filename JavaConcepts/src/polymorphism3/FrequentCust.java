package polymorphism3;

public class FrequentCust extends Customer{
	@Override
	public void doSelect() {
		System.out.println("FrequentCust.doSelect()");
	}
}
