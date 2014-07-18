import java.util.Scanner;

public class _5_DecimalToHex {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n = inp.nextInt();
		String hex = Integer.toHexString(n);
		System.out.println("Hex value is: " + hex.toUpperCase());
	}

}
