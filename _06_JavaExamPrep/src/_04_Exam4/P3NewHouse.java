package _04_Exam4;

import java.util.Scanner;

public class P3NewHouse {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		
		int dash1 = n/2, dash2 = n/2; 
		for (int i = 0; i < n + n/2+1; i++) {
			for (int j = 0; j < n; j++) {
				if (i < n/2 && (j < dash1 || j > dash2)) {
					System.out.print("-");
				}
				else if (i > n/2 && (j == 0 || j == n-1)) {
					System.out.print("|");
				}
				else {
				System.out.print("*");
				}
				
			}
			dash1--; dash2++;
			System.out.println();
		}
	}
}
