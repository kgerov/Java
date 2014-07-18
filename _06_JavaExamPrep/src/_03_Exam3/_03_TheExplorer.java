package _03_Exam3;

import java.util.Scanner;

public class _03_TheExplorer {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n  = inp.nextInt();
		
		//String str = new String(new char[10]).replace("\0", "*");
		System.out.print(new String(new char[n/2]).replace("\0", "-"));
		System.out.print("*");
		System.out.println(new String(new char[n/2]).replace("\0", "-"));
		
		for (int i = 1, j = n/2-1, p = 1; i <= n/2; i++, j--, p+=2) {
			System.out.print(new String(new char[j]).replace("\0", "-"));
			System.out.print("*");
			System.out.print(new String(new char[p]).replace("\0", "-"));
			System.out.print("*");
			System.out.println(new String(new char[j]).replace("\0", "-"));
		}
		
		for (int i = 1, j = 1, p = n-4; i < n/2; i++, j++, p-=2) {
			System.out.print(new String(new char[j]).replace("\0", "-"));
			System.out.print("*");
			System.out.print(new String(new char[p]).replace("\0", "-"));
			System.out.print("*");
			System.out.println(new String(new char[j]).replace("\0", "-"));
		}
		
		System.out.print(new String(new char[n/2]).replace("\0", "-"));
		System.out.print("*");
		System.out.println(new String(new char[n/2]).replace("\0", "-"));
	}

}
