package _04_JavaCollectionsBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Input line of integers: ");
		String inLine = inp.nextLine();
		String[] nums = inLine.split(" ");
		ArrayList<String> finalS = new ArrayList<>();
		
		int[] intN = new int [nums.length];
		for (int i = 0; i < nums.length; i++) {
			int curr = Integer.parseInt(nums[i]);
			intN[i] = curr;
		}
		
		String currSeq = "";
		boolean isNew = true;
		for (int i = 0; i < intN.length; i++) {
			if (isNew) {
				currSeq = Integer.toString(intN[i]);
				isNew = false;
			}
			try {
				if (intN[i] < intN[i+1]) {
					currSeq += " " + Integer.toString(intN[i+1]);
				}
				else {
					isNew = true;
					finalS.add(currSeq);
				}
			} catch (IndexOutOfBoundsException e) {
				finalS.add(currSeq);
			}
			
		}
		int maxSize = 0;
		int maxIter = 0;
		int currIter = 0;
		
		for (String s : finalS) {
			System.out.println(s);
			if (s.length() > maxSize) {
				maxSize = s.length();
				maxIter = currIter;
			}
			currIter++;
		}
		
		System.out.println("The longest: " + finalS.get(maxIter));
	}

}
