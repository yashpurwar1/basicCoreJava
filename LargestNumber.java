package day5;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		int first, second, third;
		System.out.println("Enter three numbers");
		Scanner scanner = new Scanner(System.in);
		first = scanner.nextInt();
		second = scanner.nextInt();
		third = scanner.nextInt();
		if (first>second && first>third) {
			System.out.println(first+" is largest");
		}else if(second>first && second>third) {
			System.out.println(second+" is largest");
		}else if(third>first && third>second) {
			System.out.println(third+" is largest");
		}else {
			System.out.println("Either two of them are equal or all are equal");
		}
		scanner.close();
	}

}
