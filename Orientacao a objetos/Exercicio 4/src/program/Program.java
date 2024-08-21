package program;

import java.text.DecimalFormat;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.00");
		
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		System.out.println("Amount to be paied: "+df.format(CurrencyConverter.converter(price, amount)));
		sc.close();
	}

}
