import java.util.Scanner;

import entities.Triangle;

import java.text.DecimalFormat;
public class Problema1 {

	static Scanner s = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("####.####");
	public static void main(String[] args) {
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Informe 3 lados do triangulo 1");
		x.ladoA 	= s.nextDouble();
		x.ladoB 	= s.nextDouble();
		x.ladoC 	= s.nextDouble();
		
		System.out.println("Informe 3 lados do triangulo 2");
		y.ladoA 	= s.nextDouble();
		y.ladoB 	= s.nextDouble();
		y.ladoC 	= s.nextDouble();
		
		double area1 = x.calculaArea();	
		double area2 = y.calculaArea();
		
		System.out.println("Area do Triangulo 1: "+df.format(area1));
		System.out.println("Area do Triangulo 2: "+ df.format(area2));
		System.out.println("Maior area: "+((area1 > area2)?"Triangulo 1":"Triangulo 2"));
	}

}
