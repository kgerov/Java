package _04_JavaCollectionsBasics;

import java.util.Scanner;

public class _05_CountAllWords {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Input text: ");
		String inputLine = inp.nextLine();
		String[] wordCount = inputLine.split("\\W+");
		System.out.println(wordCount.length);
	}

}
