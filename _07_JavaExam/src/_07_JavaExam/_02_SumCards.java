package _07_JavaExam;

import java.util.Scanner;

public class _02_SumCards {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String line = inp.nextLine();
		String[] cards = line.split(" ");
		for (int i = 0; i < cards.length; i++) {
			String replace = cards[i].charAt(cards[i].length()-1) + "";
			cards[i] = cards[i].replace(replace, "");
			if (cards[i].equals("J")) {
				cards[i] = "12";
			}
			else if (cards[i].equals("Q")) {
				cards[i] = "13";
			}
			else if (cards[i].equals("K")) {
				cards[i] = "14";
			}
			else if (cards[i].equals("A")) {
				cards[i] = "15";
			}
		}
		
		long sum = 0;
		
		for (int i = 0; i < cards.length; i++) {
			if (i < cards.length-1 && cards[i].equals(cards[i+1])) {
				sum += (Integer.parseInt(cards[i]) * 2);
			}
			else if (i > 0 && cards[i].equals(cards[i-1])) {
				sum += (Integer.parseInt(cards[i]) * 2);
			}
			else {
				sum += Integer.parseInt(cards[i]);
			}
		}
		System.out.println(sum);
	}

}
