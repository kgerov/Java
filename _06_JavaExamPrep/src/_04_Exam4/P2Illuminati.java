package _04_Exam4;

import java.math.BigDecimal;
import java.util.Scanner;

public class P2Illuminati {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String line = inp.nextLine();
		line = line.toLowerCase();
		int counter = 0;
		BigDecimal sum = new BigDecimal("0");
		
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u') {
				switch (line.charAt(i)) {
				case 'a':
					sum = sum.add(new BigDecimal("65"));
					break;
				case 'e':
					sum = sum.add(new BigDecimal("69"));
					break;
				case 'i':
					sum = sum.add(new BigDecimal("73"));
					break;
				case 'o':
					sum = sum.add(new BigDecimal("79"));
					break;
				case 'u':
					sum = sum.add(new BigDecimal("85"));
					break;
				}
				counter++;
			}
		}
		System.out.println(counter);
		System.out.println(sum);
	}

}
