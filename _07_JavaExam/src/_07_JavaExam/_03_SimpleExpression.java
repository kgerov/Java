package _07_JavaExam;
///Minus infront of first number!

import java.math.BigDecimal;
import java.util.Scanner;

public class _03_SimpleExpression {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String line = inp.nextLine();
		line = line.replace(" ", "");
		BigDecimal result = new BigDecimal("0");
		
		for (int i = 0; i < line.length(); i++) {
			String currNumber = "";
			boolean add = true;
			if (i > 0 && line.charAt(i-1) == '+') {
				add = true;
			}
			else if(i > 0) {
				add = false;
			}
				
			while(i < line.length() && (line.charAt(i) != '+' && line.charAt(i) != '-')) {
				currNumber+=line.charAt(i);
				i++;
			}
			BigDecimal currN = new BigDecimal(currNumber);
			if (add) {
				result = result.add(currN);
			}
			else {
				result = result.subtract(currN);
			}
				
		}
		
		System.out.printf("%.7f", result);
	}

}
