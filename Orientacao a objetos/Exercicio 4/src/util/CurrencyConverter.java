package util;

public class CurrencyConverter {
	public static double converter(double price, double amount) {
		return amount * price + ((amount * 0.06)*price);
	}
}
