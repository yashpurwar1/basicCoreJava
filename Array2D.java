package day5;

import java.util.Scanner;

public class Array2D {
	public static void input(int M, int N) {
		
	}
	public static void main(String[] args) {
		int M=0,N=0;
		System.out.println("Enter number of rows and column");
		Scanner scanner = new Scanner(System.in);
		M = scanner.nextInt();
		N = scanner.nextInt();
		int arr[][]=new int[M][N];
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.println("Enter "+i+" "+j+" index value");
				arr[i][j]=scanner.nextInt();		
			}
		}
		System.out.println("Entered array is-----");
		for (int i=0; i<M; i++) {
			for (int j=0; j<N; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		scanner.close();
	}

}
