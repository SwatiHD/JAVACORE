package interface1;

public interface IDiscount {
	public abstract int calculateDiscount(int amount, int rate);
	
	void calculateDiscountTax(int tax); // by default it is public abstract int calculateDiscountTax(int tax)
}
