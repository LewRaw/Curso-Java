import java.util.Scanner;

import entities.Produto;

public class Programa {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter product data: ");
		System.out.println("Name:");
		String name = s.nextLine();
		System.out.println("Price:");
		double price = s.nextDouble();
		System.out.println("Quantity in stock:");
		int quantity = s.nextInt();
		
		Produto product = new Produto();
		product.name = name;
		product.price = price;
		product.quantity = quantity;	
		
		System.out.println();
		System.out.println("Product data: "+ product);
		
		System.out.println();
		System.out.println("Enter number of products to be added on stock: ");
		int quantityAdd = s.nextInt();
		product.addProducts(quantityAdd);
		System.out.println();
		System.out.println("Updated data: "+ product);
		
		System.out.println();
		System.out.println("Enter number of products to be removed from stock: ");
		int quantityRmv = s.nextInt();
		product.removeProducts(quantityRmv);
		System.out.println();
		System.out.println("Updated data: "+ product);
	}

}
