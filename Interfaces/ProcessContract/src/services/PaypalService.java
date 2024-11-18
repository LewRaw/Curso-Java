package services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public double paymentFee(double amount) {
		
		return amount + (amount * 0.02);
	}

	@Override
	public double interest(double amount, int months) {

		return amount + (amount *(months * 0.01));
	}

}
