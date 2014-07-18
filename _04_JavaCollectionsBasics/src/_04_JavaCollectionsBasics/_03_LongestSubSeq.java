package _04_JavaCollectionsBasics;

import java.util.Scanner;

public class _03_LongestSubSeq {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Strings: ");
		String seq = inp.nextLine();
		String[] seqF = seq.split(" ");
		int maxIter = 0;
		int maxCounter = 1;
		
		for (int i = 0; i < seqF.length -1; i++) {
			int counter = isEqual(seqF, i);
			if (counter > maxCounter) {
				maxCounter = counter;
				maxIter = i;
			}
		}
		
		for (int i = 0, p = maxIter; i < maxCounter; i++, p++) {
			System.out.print(seqF[p] + " ");
		}
	}
		
	static private int isEqual (String[] seqF, int i) {
		int counter = 1;
		while ((i < seqF.length - 1) && seqF[i].equals(seqF[i+1]) && seqF[i]!="") {
			counter++;
			i++;
		}
		return counter;
	}

}
