package program;

import java.util.Scanner;

import entities.Student;

public class Program {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the student's name followed by the grades for the 3 trimesters: ");
		Student student = new Student();
		student.name = s.nextLine();
		student.t1 = s.nextDouble();
		student.t2 = s.nextDouble();
		student.t3 = s.nextDouble();
		
		System.out.println("FINAL GRADE = "+student.sumGrades());
		System.out.println(student.checkPassed());
		
	}

}
