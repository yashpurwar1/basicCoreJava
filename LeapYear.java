package day5;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a year to check");
		int year=scanner.nextInt();
		if (year<=9999 && year>=1000) {
			if (year%4!=0) {
				System.out.println("Not a leap year");
			}
			else if (year%400==0) {
				System.out.println("Leap year");
			}
			else if(year%100==0) {
				System.out.println("Not a leap year");
			}
			else {
				System.out.println("Leap year");
			}
		}
		else {
			System.out.println("incorrect input");
		}
		scanner.close();
	}
}
