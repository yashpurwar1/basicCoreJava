package day5;
import java.util.Scanner;
public class PowerOf2 {

	public static void main(String[] args) {
		System.out.println("Enter the value of N");
		Scanner scanner= new Scanner(System.in);
		int N=scanner.nextInt();
		if(N<=30 && N>=0) {
			for(int i=0;i<=N;i++) {
				System.out.println((int) Math.pow(2, i));
			}
		}
		else {
			System.out.println("Value of N must be between 0 to 31");
		}
		scanner.close();
	}

}
