package day5;

import java.util.Scanner;

public class HarmonicValue {

	public static void main(String[] args) {
		double total = 0;
		System.out.println("Enter the value of N");
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		if (N != 0) {
			for (int i = 1; i <= N; i++) {
				total = total + (double) 1 / i;
			}
		} else {
			System.out.println("Entered numbe is zero");
		}
		System.out.println(total);
		scanner.close();
	}

}
