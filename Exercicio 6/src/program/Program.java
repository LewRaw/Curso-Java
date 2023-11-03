package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Employee> listEmployee = new ArrayList<>();
		
		//PARTE 1 - LENDO OS DADOS
		System.out.println("How many employees will be registred?");
		int manyEmployess = sc.nextInt();
		
		for( int i = 1; i <= manyEmployess; i ++) {
			System.out.println("Employee #" + i);
			
			System.out.println("Id: ");
			int employeeId = sc.nextInt();		
				while(hasId(listEmployee, employeeId)) {
					System.out.print("Id already taken. Try again: ");
					employeeId = sc.nextInt();
				}
			sc.nextLine();
			System.out.println("Name: ");
			String employeeName = sc.nextLine();
			
			System.out.println("Salary: ");
			double employeeSalary = sc.nextDouble();
			
			listEmployee.add(new Employee(employeeId, employeeName, employeeSalary));	
		}
		
		System.out.println("Enter the employee id that will have salaray increase:" );
		int idIncrease = sc.nextInt();
		while(hasId(listEmployee, idIncrease)) {
			System.out.print("Id not exists. Try again: ");
			idIncrease = sc.nextInt();
		}
		
		System.out.println("Enter the percentage:");
		double percentageIncrease = sc.nextDouble();
		for(Employee objEmployee : listEmployee) {		
			if(objEmployee.getId() == idIncrease) {
				objEmployee.increaseSalary(percentageIncrease);
				System.out.println(objEmployee.toString());
			}		
		}
		
		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
