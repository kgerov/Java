package _01_Exam1;

import java.util.Scanner;

public class _04_NineDigitMagicNumbers {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int sum = inp.nextInt();
		int diff = inp.nextInt();
		boolean isMagic = false;
		
		for (int a = 1; a <= 7; a++) {
			for (int b = 1; b <= 7; b++) {
				for (int c = 1; c <= 7; c++) {
					for (int d = 1; d <= 7; d++) {
						for (int e = 1; e <= 7; e++) {
							for (int f = 1; f <= 7; f++) {
								for (int g = 1; g <= 7; g++) {
									for (int h = 1; h <= 7; h++) {
										for (int i = 1; i <= 7; i++) {
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
