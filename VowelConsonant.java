package day5;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		System.out.println("Enter a alphabet");
		Scanner scanner = new Scanner(System.in);
		char alpha = scanner.next().charAt(0);
		if (alpha == 'a' || alpha == 'A' || alpha == 'e' || alpha == 'E' || alpha == 'I' || alpha == 'i' || alpha == 'o'
				|| alpha == 'O' || alpha == 'u' || alpha == 'U') {
			System.out.println(alpha+" is a vowel");
		} else {
			System.out.println(alpha+" is a consonant");
		}
		scanner.close();
	}

}
