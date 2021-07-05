package day5;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter a number to find weather its even or odd");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num%2==0) {
			System.out.println("Its a even number");
		}
		else {
			System.out.println("Its a odd number");
		}
		scanner.close();
	}

}
