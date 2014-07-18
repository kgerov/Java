package _07_JavaExam;

import java.util.Scanner;

public class _01_StuckNumbers {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = inp.nextInt();
		}
		boolean flag = false;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int j2 = 0; j2 < n; j2++) {
					for (int k = 0; k < n; k++) {
						if (i == j || i == j2 || i == k || j == j2 || j == k || j2 == k) {
							continue;
						}
						if(isStuck(i, j, j2, k, numbers)) {
							flag = true;
						}
					}
				}
			}
		}
		if (!flag) {
			System.out.println("No");
		}
	}
	
	public static boolean isStuck(int i, int j, int j2, int k, int[] numbers) {
		String leftP = Integer.toString(numbers[i]) + Integer.toString(numbers[j]); 
		String rightP = Integer.toString(numbers[j2]) + Integer.toString(numbers[k]); 
		if (leftP.equals(rightP)) {
			System.out.println(numbers[i] + "|" + numbers[j] + "==" + numbers[j2] + "|" + numbers[k]);
			return true;
		}
		return false;
	}

}
