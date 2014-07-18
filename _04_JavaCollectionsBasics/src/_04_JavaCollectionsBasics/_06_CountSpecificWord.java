package _04_JavaCollectionsBasics;

import java.util.Scanner;

public class _06_CountSpecificWord {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter text: ");
		String inputLine = inp.nextLine();
		System.out.print("Enter word: ");
		String word = inp.nextLine();
		
		String[] wordCount = inputLine.split("\\W+");
		for (int i = 0; i < wordCount.length; i++) {
			wordCount[i] = wordCount[i].toLowerCase();
		}
		word = word.toLowerCase();
		int counterSp = 0;
		for (String s : wordCount) {
			if (s.equals(word)) {
				counterSp++;
			}
		}
		System.out.println("Specific Word Count: " + counterSp);
	}

}
