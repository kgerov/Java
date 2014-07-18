package _03_Exam3;

import java.util.Scanner;
import java.math.BigDecimal;

public class _02_SumOfElements {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String line = inp.nextLine();
		String[] ints = line.split(" ");

		BigDecimal[] list = new BigDecimal[ints.length];
		for (int i = 0; i < list.length; i++) {
			BigDecimal c = new BigDecimal(ints[i]);
			list[i] = c;
		}
		
 		BigDecimal minDiff = new BigDecimal("0");
 		BigDecimal sum = new BigDecimal("0");
 		boolean flag = false;
 		for (int i = 0; i < list.length; i++) {
 			BigDecimal cSum = new BigDecimal("0");
			for (int j = 0; j < list.length; j++) {
				if (i != j) {
					cSum = cSum.add(list[j]);
				}
			}
			if (i == 0) {
				minDiff = list[i].subtract(cSum).abs();
			}
			
			if (list[i].equals(cSum)) {
				sum = cSum;
				flag = true;
			}
			else if (list[i].subtract(cSum).abs().compareTo(minDiff) == -1) {
				minDiff = list[i].subtract(cSum).abs();
			}
		}
 		if (!flag) {
 			System.out.println("No, diff=" + minDiff);
		}
		else {
			System.out.println("Yes, sum="+sum);
		}
	}

}
