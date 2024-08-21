package entities;

public class Triangle {

		public double ladoA,ladoB,ladoC;;	
		
		public double calculaArea() {
			double p = (ladoA + ladoB + ladoC) / 2;
			return Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
		}
}
