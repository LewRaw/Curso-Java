package entities;
import java.text.DecimalFormat;

public class Account {
	private long number;
	private String holder;
	private double balance;
	private static DecimalFormat df = new DecimalFormat("#0.00");
	
	public Account(long number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(long number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public long getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double ammount) {
		this.balance += ammount;
	}
	
	public void withdraw(double ammount) {
		this.balance -= ammount + 5.00;
	}
	
	public String toString() {
		
		return 	"Acount " + number + ", Holder: " + holder + ", Balance: $ " + df.format(balance);
	}
	
	
}
