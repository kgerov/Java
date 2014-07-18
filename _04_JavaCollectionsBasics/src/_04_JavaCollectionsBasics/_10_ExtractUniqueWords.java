package _04_JavaCollectionsBasics;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10_ExtractUniqueWords {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter text: ");
		String line = inp.nextLine();
		line = line.toLowerCase();
		String[] words = line.split("\\W");
		
		Set<String> wordSet = new TreeSet<String>();
		for (int i = 0; i < words.length; i++) {
			wordSet.add(words[i]);
		}
		
		for (String s : wordSet) {
			System.out.print(s + " ");
		}
	}

}
