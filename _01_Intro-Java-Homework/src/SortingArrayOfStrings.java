import java.util.Arrays;
import java.util.Scanner;

public class SortingArrayOfStrings {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = inp.nextInt();
		inp.nextLine();
		String[] names = new String[n];
		
		for(int i = 0; i < names.length; i++) {
			System.out.print("Name " + (i + 1) + ": ");
			names[i] = inp.nextLine();
		}
		
		Arrays.sort(names);
		
		System.out.println("_______________________");
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}
