import java.util.Locale;
import java.util.Scanner;


public class _6_FormattingNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Input int: ");
		int a = inp.nextInt();
		System.out.print("Input double: ");
		double b = inp.nextDouble();
		System.out.print("Input double: ");
		double c = inp.nextDouble();
		
		String hex = Integer.toHexString(a);
		hex = hex.toUpperCase();
		
		String bin = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');
		
		if (c%1 == 0) {
			System.out.printf("|%-10s|%s|%10.2f|%-10.0f|",hex,bin,b,c);
		}
		else {
			System.out.printf("|%-10s|%s|%10.2f|%-10.3f|",hex,bin,b,c);
		}
	}

}
