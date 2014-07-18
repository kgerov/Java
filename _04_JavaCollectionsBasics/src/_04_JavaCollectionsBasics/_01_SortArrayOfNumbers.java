package _04_JavaCollectionsBasics;

import java.util.Arrays;
import java.util.Scanner;

public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Input n: ");
		int n = inp.nextInt();
		int[] nums = new int[n];
		System.out.printf("Input %d numbers: ", n);
		for (int i = 0; i < n; i++) {
			nums[i] = inp.nextInt();
		}
		
		Arrays.sort(nums);
		
		for (int i : nums) {
			System.out.printf("%d ", i);
		}
	}	

}
