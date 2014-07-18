package _02_Exam2;

import java.util.Scanner;

public class _04_HayvanNumbers {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int sum = inp.nextInt();
		int diff = inp.nextInt();
		boolean isMagic = false;
		
		for (int a = 5; a <= 9; a++) {
			for (int b = 5; b <= 9; b++) {
				for (int c = 5; c <= 9; c++) {
					for (int d = 5; d <= 9; d++) {
						for (int e = 5; e <= 9; e++) {
							for (int f = 5; f <= 9; f++) {
								for (int g = 5; g <= 9; g++) {
									for (int h = 5; h <= 9; h++) {
										for (int i = 5; i <= 9; i++) {
											if ((a+b+c+d+e+f+g+h+i == sum) && ((i + h*10 + g*100) - (f + e*10 + d*100) == diff) && ((f + e*10 + d*100) - (a*100 + b*10 + c) == diff)) {
												 System.out.printf("%d%d%d%d%d%d%d%d%d", a, b, c, d, e, f, g, h, i);
												 isMagic = true;
												 System.out.println();
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		if (isMagic  == false) {
			System.out.println("No");
		}
	}

}
