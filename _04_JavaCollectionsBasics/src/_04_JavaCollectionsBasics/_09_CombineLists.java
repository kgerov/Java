package _04_JavaCollectionsBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class _09_CombineLists {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Line 1: ");
		String lineO = inp.nextLine();
		System.out.print("Line 2: ");
		String lineT = inp.nextLine();
		
		ArrayList<Character> lineOne = inputData(lineO);
		ArrayList<Character> lineTwo = inputData(lineT);
		
		for (int i = 0; i < lineOne.size(); i++) {
			for (int j = 0; j < lineTwo.size(); j++) {
				//boolean remove = false;
				char rem = 0;
				if (lineOne.get(i) == lineTwo.get(j)) {
					//remove = true;
					rem = lineTwo.get(j); 
					for (int k = 0; k < lineTwo.size(); k++) {
						if (lineTwo.get(k) == rem) {
							lineTwo.remove(k);
							k--;
						}
					}
				}
			}
		}
		
		for (Character c : lineTwo) {
			lineOne.add(c);
		}
		
		for (Character c: lineOne) {
			System.out.print(c + " ");
		}
	}

	private static ArrayList<Character> inputData(String line) {
		String[] lineS = line.split(" ");
		ArrayList<Character> lineList = new ArrayList<>();
		for (int i = 0; i < lineS.length; i++) {
			char curr = lineS[i].charAt(0);
			lineList.add(curr);
		}
		
		return lineList;
	}

}
