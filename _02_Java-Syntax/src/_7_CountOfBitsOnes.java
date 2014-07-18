import java.util.Scanner;


public class _7_CountOfBitsOnes {

	public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
		
		System.out.print("Input integer: ");
		int a = inp.nextInt();
		int bitCount = Integer.bitCount(a);
		
		System.out.println(bitCount);
		//main(args);
	}

}
