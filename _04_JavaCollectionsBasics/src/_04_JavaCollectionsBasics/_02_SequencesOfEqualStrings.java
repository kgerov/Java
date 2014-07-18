package _04_JavaCollectionsBasics;

import java.util.Scanner;

public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Strings: ");
		String seq = inp.nextLine();
		String[] seqF = seq.split(" ");
		
		for (int i = 0; i < seqF.length-1; i++) {
			int counter = isEqual(seqF, i);
			if (counter != 1) {
				seqF = modifyString(seqF, counter, i);
			}
		}
		
		for (String s : seqF) {
			if (!s.equals("")) {
			System.out.println(s);
			}
		}
	}
	
	static private String[] modifyString (String[] seqF, int counter, int i) {
		String readyS = "";
		String sub = seqF[i];
		for (int j = 0; j < counter; j++) {
			readyS += sub + " ";
		}
		
		for (int j = 0, p = i; j < counter; j++, p++) {
			seqF[p] = "";
		}
		seqF[i] = readyS;
		return seqF;
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
