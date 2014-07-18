import java.util.Scanner;

public class _8_CountOfEqualBitsPairs {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter int: ");
		int a = inp.nextInt();
		String binary = Integer.toBinaryString(a);
		int counter = 0;
		
		for (int i = 0; i < binary.length(); i++) {
			
			if (i <binary.length()-1) {
			char bit1 = binary.charAt(i);
			char bit2 = binary.charAt(i+1);		
				if (bit1 == bit2) {
					counter++;
				}
			}
		}
		
		System.out.println(counter);
		//main(args);
	}

}
