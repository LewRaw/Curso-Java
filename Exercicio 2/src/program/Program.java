package program;

import java.text.DecimalFormat;
import java.util.Scanner;

import entities.Employee;

public class Program {
	static DecimalFormat df = new DecimalFormat("##.##");
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		System.out.println("Data of employee ");
		System.out.println("Name: ");
		employee.name = s.nextLine();
		System.out.println("Gross Salary: ");
		employee.grossSalary = s.nextDouble();
		System.out.println("Tax: ");
		employee.tax = s.nextDouble();
		
		System.out.println("Employee: "+ employee + employee.netSalary());
		
		System.out.println("Which percentage increase salary? ");
		double percentageIncrease = s.nextDouble();	
		employee.increaseSalary(percentageIncrease);
		System.out.println("Updated data: "+ employee + employee.netSalary());
		

	}

}
