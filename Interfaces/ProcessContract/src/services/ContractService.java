package services;

import java.time.LocalDate;
import java.util.Iterator;

import entities.Contract;
import entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	
	public void processContract(Contract contract, Integer months ){
		
		double InstallmentOriginalValue = contract.getOriginalValue() / months;	
		LocalDate dateInstallment = contract.getDate();
		
		for (Integer iterator = 1; iterator <= months; iterator ++ ) {
			//Para cada parcela
			
			double valueInstallment = onlinePaymentService.interest(InstallmentOriginalValue, iterator);
			valueInstallment = onlinePaymentService.paymentFee(valueInstallment);
			
			
			Installment installment = new Installment(dateInstallment, valueInstallment);
			contract.addInstallments(installment);
			dateInstallment.plusMonths(1);
		}
	}
}
