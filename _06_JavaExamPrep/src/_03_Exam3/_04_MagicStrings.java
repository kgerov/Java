package _03_Exam3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class _04_MagicStrings {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int diff = inp.nextInt();
		boolean flag = false;
		ArrayList<String> ordered = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					for (int l = 0; l < 4; l++) {
						int sum = corresNum(i) + corresNum(j) + corresNum(k) + corresNum(l);
						for (int i2 = 0; i2 < 4; i2++) {
							for (int j2 = 0; j2 < 4; j2++) {
								for (int k2 = 0; k2 < 4; k2++) {
									for (int l2 = 0; l2 < 4; l2++) {
										int sum2 = corresNum(i2) + corresNum(j2) + corresNum(k2) + corresNum(l2);
										if (Math.abs(sum-sum2) == diff) {
											String result = correslet(i) + correslet(j) + correslet(k) + correslet(l) + correslet(i2) + correslet(j2) + correslet(k2) + correslet(l2);
											ordered.add(result);
											flag = true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (!flag) {
			System.out.println("No");
		}else {
			Collections.sort(ordered);
			for (String s : ordered) {
				System.out.println(s);
			}
		}
	
	}
	
	private static int corresNum (int n) {
		switch (n) {
		case 0:
			return 3;
		case 1:
			return 4;
		case 2:
			return 1;
		case 3:
			return 5;
		}
		return -1000;
	}
	
	private static String correslet (int n) {
		switch (n) {
		case 0:
			return "s";
		case 1:
			return "n";
		case 2:
			return "k";
		case 3:
			return "p";
		}
		return "error";
	}
}
