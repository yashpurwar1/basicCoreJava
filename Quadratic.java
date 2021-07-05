package day5;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		double a,b,c,delta,root1,root2;
		System.out.println("Enter value of a,b and c");
		Scanner scanner = new Scanner(System.in);
		a=scanner.nextDouble();
		b=scanner.nextDouble();
		c=scanner.nextDouble();
		delta=Math.abs((b*b)-(4*a*c));
		root1= (-(b)+Math.sqrt(delta))/(2*a);
		root2= (-(b)-Math.sqrt(delta))/(2*a);
		System.out.println("Roots are "+root1+" and "+root2);
		scanner.close();
	}

}
