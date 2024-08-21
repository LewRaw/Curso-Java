package program;

import java.util.Scanner;
import entities.Account;
public class Program {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Account account;
		
		System.out.println("Banco da Alegria!");
		System.out.println("Informe o numero da conta: ");
		long accountNumber = s.nextLong();	
		System.out.println("Informe o Nome do titular da conta: ");
		s.nextLine();
		String accountHolder = s.nextLine();
		System.out.println("Você deseja fazer algum deposito inicial (s/n)? ");
		String opcao = s.nextLine();
		
		if (opcao.equalsIgnoreCase("s")) {
			System.out.println("Informe o depósito incial:");
			double initialDeposit = s.nextDouble();
			account = new Account(accountNumber, accountHolder, initialDeposit);
		}else {
			account = new Account(accountNumber, accountHolder);
			}
		
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value:");
		double depositValue = s.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("Updated data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value:");
		double decreaseValue = s.nextDouble();
		account.withdraw(decreaseValue);
		
		System.out.println("Updated data:");
		System.out.println(account);
		System.out.println();
	}

}
