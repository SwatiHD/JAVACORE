package polymorphism4;

public class PaymentProcessor {
	public void selectProcessor(Payment payment) {
		payment.doPayment(); //calls CreditPayment method during compile time ,, Payment payment = new CreditPayment()//polymorphism
	}
}
