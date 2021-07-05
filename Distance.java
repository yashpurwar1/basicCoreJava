package day5;

public class Distance {

	public static void main(String args[]) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		double distance=Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
		System.out.println("Distance = "+distance);

	}

}
