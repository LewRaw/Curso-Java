package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Contract {
	private Integer number;
	private LocalDate date;
	private double originalValue;
	private double totalValue;
	private ArrayList<Installment> Installments;
	
	
	public Contract(LocalDate date, double originalValue) {
		super();
		this.date = date;
		this.originalValue = originalValue;
		this.Installments = new ArrayList<Installment>();
	}
	public Integer getNumber() {
		return number;
	}
	public double getOriginalValue() {
		return originalValue;
	}
	public LocalDate getDate() {
		return date;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public ArrayList<Installment> getInstallments() {
		return Installments;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	public void setInstallments(ArrayList<Installment> installments) {
		Installments = installments;
	}
	
	public void addInstallments(Installment installment) {
		this.Installments.add(installment);
	}
	
	public void listFormattedInstallments(Contract contract) {
	    // Formato desejado para a data
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	    // Itera pelas parcelas do contrato
	    for (Installment installment : contract.getInstallments()) {
	        String formattedDate = installment.getDueDate().format(formatter);
	        double amount = installment.getAmount();

	        // Imprime data e valor formatados
	        System.out.println("Data: " + formattedDate + " - Valor: R$ " + String.format("%.2f", amount));
	    }
	}
}
