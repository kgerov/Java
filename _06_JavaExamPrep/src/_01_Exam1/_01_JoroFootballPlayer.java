package _01_Exam1;

import java.util.Scanner;

public class _01_JoroFootballPlayer {

		public static void main(String[] args) {
			Scanner inp = new Scanner(System.in);
			String yearType = inp.nextLine();
			int p = inp.nextInt();
			int h = inp.nextInt();
			
			double weekPlays = ((52-h)*2)/3.0;
			double hometownPlays = h;
			double holidayPlays = p/2.0;
			
			if (yearType.equals("f")) {
				System.out.println((int)(weekPlays+hometownPlays + holidayPlays));
			}
			else {
				System.out.println((int)(weekPlays+hometownPlays + holidayPlays + 3));
			}

	}

}
