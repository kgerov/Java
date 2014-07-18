package _02_Exam2;

import java.io.IOException;
import java.util.Scanner;

public class _02_OddEvenSum {

	public static void main(String[] args) throws IOException {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		
		long evenS = 0;
		long oddS = 0;
		for (int i = 1; i <= 2*n; i++) {
			int p = inp.nextInt();
			if (i % 2 == 0) {
				evenS += p;
			}
			else {
				oddS += p;
			}
		}
		if (oddS == evenS) {
			System.out.printf("Yes, sum=%d", oddS);
		}
		else {
			System.out.printf("No, diff=%d", Math.abs(evenS - oddS));
		}
	}

}
