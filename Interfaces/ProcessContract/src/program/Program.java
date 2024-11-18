package program;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Contract;
import services.ContractService;
import services.OnlinePaymentService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dados do contrato:");
		
		System.out.print("Data (dd/MM/yyyy):");
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(sc.next(), dateFormat);
		
		System.out.print("Valor do contrato:");
		double valor = sc.nextDouble();
		
		System.out.print("Numero de parcelas:");
		int amountInstallment = Integer.parseInt(sc.next());
		
		Contract contract = new Contract(date, valor);
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(contract, amountInstallment);
		
		contract.listFormattedInstallments(contract);
		sc.close();
	}

}
