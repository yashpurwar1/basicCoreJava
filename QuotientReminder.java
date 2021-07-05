package day5;
import java.util.Scanner;
public class QuotientReminder {

	public static void main(String[] args) {
		System.out.println("Enter divisor and dividend");
		Scanner scanner=new Scanner(System.in);
		int divisor = scanner.nextInt();
		int dividend = scanner.nextInt();
		int quotient = dividend/divisor;
		int reminder = dividend%divisor;
		System.out.println("Quotient is = "+quotient+" and Reminder is = "+reminder);
		scanner.close();
	}

}
