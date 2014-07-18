package _03_Exam3;

import java.util.Scanner;

public class _01_WorkHours {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int h = inp.nextInt();
		int d = inp.nextInt();
		int p = inp.nextInt();
		
		int result = (int)(d*0.9*12*p/100);
		if (result >= h) {
			System.out.println("Yes");
			System.out.println(result - h);
		}
		else {
			System.out.println("No");
			System.out.println(result - h);
		}
	}

}
