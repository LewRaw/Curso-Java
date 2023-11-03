package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Devedor;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int menuOption = menuQuestion();
		List<Devedor> listDebtors = new ArrayList<>();

		while (menuOption != 6) {
			switch (menuOption) {
				case 1:
					addDebtor(listDebtors);
					break;
				case 2:
					// increaseDebt();
					break;
				case 3:
					// decreaseDebt();
					break;
				case 4:
					// listDebtors();
					break;
				case 5:
					// listDebtor();
					break;
				default:
					System.out.println("Opção não encontrada");
			}
			menuOption = menuQuestion();
		}

	}

	static private void addDebtor(List<Devedor> listDebtors) {
		Devedor debtor;
		sc.nextLine();
		System.out.println("Deseja inserir um devedor? s/n");
		String option = sc.nextLine();
		while (option.equalsIgnoreCase("s")) {
			System.out.println("Digite o nome do devedor:");
			String name = sc.nextLine();
			System.out.println("Deseja informar uma divida para esse devedor? s/n");
			String debtOption = sc.nextLine();

			if (debtOption.equalsIgnoreCase("s")) {
				System.out.println("Informe a divida (#,##)");
				double amountDebt = sc.nextDouble();
				debtor = new Devedor(name, amountDebt);
			} else
				debtor = new Devedor(name);

			listDebtors.add(debtor);
			System.out.println("Deseja inserir mais um devedor? s/n");
			option = sc.next();
		}
	}

	static private int menuQuestion() {
		System.out.println("Funcionalidades");
		System.out.println("------------------------------------");
		System.out.println("1- Para Adicionar devedor");
		System.out.println("2- Para Adicionar divida");
		System.out.println("3- Para Diminuir divida");
		System.out.println("4- Para Listar devedores");
		System.out.println("5- Para Listar devedor Especifico");
		System.out.println("6- Para Sair");
		System.out.println("------------------------------------");
		return sc.nextInt();
	}
}
