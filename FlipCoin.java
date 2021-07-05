package day5;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		double tails = 0, heads = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many flips:");
		double noOfFlips = scanner.nextInt();
		for (int i = 1; i <= noOfFlips; i++) {
			double rand = Math.random();
			if (rand < 0.5) {
				tails++;
			} else {
				heads++;
			}
		}
		System.out.println("Percentage of tails="+ (tails*100)/noOfFlips+ " And Tails obtained= "+tails);
		System.out.println("Percentage of heads="+(heads*100)/noOfFlips+ " And Heads obtained= "+heads);
		scanner.close();
		if (noOfFlips<0) {
			System.out.println("Entered number was negative");
		}
	}
}
