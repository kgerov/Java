package _04_Exam4;

import java.util.Scanner;

public class P1Cinema {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String type = inp.nextLine();
		int row = inp.nextInt();
		int col = inp.nextInt();
		double price = 0;
		switch (type) {
		case "Premiere":
			price = 12;
			break;
		case "Normal":
			price = 7.5;
			break;
		case "Discount":
			price = 5;
			break;
		}
		
		System.out.printf("%.2f leva", (price*row*col));
	}

}
