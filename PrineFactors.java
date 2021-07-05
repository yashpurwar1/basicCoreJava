package day5;

import java.util.Scanner;

public class PrineFactors {

	public static void primeFactors(int n) {
		while (n % 2 == 0) {
			System.out.println(2 + " ");
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}
		if (n > 2)
			System.out.print(n);
	}

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		primeFactors(n);
		scanner.close();
	}

}
