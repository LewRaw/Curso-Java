package entities;

public class Devedor {
	private String name;
	private Double balance;

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public Double getSaldo() {
		return balance;
	}

	public Devedor(String nome, double saldo) {
		this.name = nome;
		this.balance = saldo;
	}

	public Devedor(String nome) {
		this.name = nome;
	}

	public void increaseBalance(double value) {
		balance += value;
	}

	public void decreaseBalance(double value) {
		balance -= value;
	}
}
