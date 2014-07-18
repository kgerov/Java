package _02_Exam2;

import java.util.Scanner;

public class _01_VolleyballBoncho {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String yearType = inp.nextLine();
		int p = inp.nextInt();
		int h = inp.nextInt();
		
		double hometown = h;
		double normal = ((48 - h)*3)/4.0;
		double holiday = (p*2)/3.0;
		double result = hometown + normal + holiday;
		
		if (yearType.equals("normal")) {
			System.out.println((int)result);
		}
		else {
			System.out.println((int)(result*1.15));
		}
	}

}
