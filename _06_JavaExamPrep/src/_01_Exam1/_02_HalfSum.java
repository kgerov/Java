package _01_Exam1;

import java.util.Scanner;

public class _02_HalfSum {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		
		long sum1 = 0;
		for (int i = 0; i < n; i++) {
			int sample = inp.nextInt();
			sum1 += sample;
		}
		
		long sum2 = 0;
		for (int i = 0; i < n; i++) {
			int sample = inp.nextInt();
			sum2 += sample;
		}
		
		if (sum1 == sum2) {
			System.out.printf("Yes, sum=%d", sum1);
		}
		else {
			System.out.printf("No, diff=%d", Math.abs(sum1 - sum2));
		}
	}

}
