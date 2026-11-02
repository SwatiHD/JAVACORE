package polymorphism4;

public class Client {

	public static void main(String[] args) {
		PaymentProcessor paymentProcessor = new PaymentProcessor();

		// for #user 1, he or she selects creditPayment
		CreditPayment creditPayment = new CreditPayment();
		paymentProcessor.selectProcessor(creditPayment);

		// for #user 2, he or she selects debitPayment
		DebitPayment debitPayment = new DebitPayment();
		paymentProcessor.selectProcessor(debitPayment);

		// for #user 3, he or she selects upiPayment
		UPIPayment upiPayment = new UPIPayment();
		paymentProcessor.selectProcessor(upiPayment);
	}

}
