package _04_JavaCollectionsBasics;

import java.util.Scanner;
import java.util.regex.*;

public class _08_ExtractEmails {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter text: ");
		String inText = inp.nextLine();
		String[] sepText = inText.split(" ");
		String regex = "[A-Za-z0-9]+[A-Za-z0-9._-]*\\@[A-Za-z0-9]+[-]*[A-Za-z0-9._-]*\\.[A-Za-z]+[.]*";
		
		for (String s : sepText) {
			if (s.matches(regex)) {
				if (s.charAt(s.length()-1)=='.') {
					s = s.substring(0, s.length()-1);
				}
				System.out.println(s);
			}
		}
		
//		Scanner input = new Scanner(System.in);		
//		Scanner in = new Scanner(System.in);
//		String text = in.nextLine().toLowerCase();
//		String patternString = "[\\w-+]+(?:\\.[\\w-+]+)*@(?:[\\w-]+\\.)+[a-zA-Z]{2,7}";
//		Pattern emailPattern = Pattern.compile(patternString);
//		Matcher matcher = emailPattern.matcher(text);
//		while (matcher.find()) {
//			System.out.println(matcher.group());
//		}
	}

}
