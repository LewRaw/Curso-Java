package entities;

public class Product {
	public String nome;
	public Double preco;
	
	public String getNome() {
		return nome;
	}
	public Double getPreco() {
		return preco;
	}
	public Product(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
}
