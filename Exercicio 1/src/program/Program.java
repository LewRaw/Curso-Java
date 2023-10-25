package program;

import java.text.DecimalFormat;
import java.util.Scanner;
import entities.Rectangle;

public class Program {
	
	static public Scanner s = new Scanner(System.in);
	static public DecimalFormat df = new DecimalFormat ("##.####");
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = s.nextDouble();
		rectangle.height = s.nextDouble();
		
		System.out.println("Area = " + df.format(rectangle.Area()));
		System.out.println("Perimeter = " + df.format(rectangle.Perimeter()));
		System.out.println("Diagonal = " + df.format(rectangle.Diagonal()));
	}

}
