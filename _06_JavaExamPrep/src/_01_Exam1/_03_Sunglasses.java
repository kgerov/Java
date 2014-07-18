package _01_Exam1;

import java.util.Scanner;

public class _03_Sunglasses {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5*n; j++) {
				if ((i == 0 || i == n-1) && (j < 2*n || j >= 3*n)) {
					System.out.print("*");
				}
				else if (j == 0 || j == 2*n-1 || j == 3*n || j == 5*n-1 ) {
					System.out.print("*");
				}
				else if (i > 0 && i < n -1 && j > 0 && j < 2*n-1) {
					System.out.print("/");
				}
				else if (i > 0 && i < n -1 && j > 3*n && j < 5*n-1) {
					System.out.print("/");
				}
				else if (i == n/2 && j >= 2*n && j < 3*n) {
					System.out.print("|");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
