import java.util.Scanner;


public class _01_SymmetricNumbers {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter range: ");
		int beginR = inp.nextInt();
		int endR = inp.nextInt();
		
		for (int i = beginR; i <= endR; i++) {
			String num = Integer.toString(i);			
			if (checkSymmetry(num)) {
				System.out.print(i + " ");
			}
		}
	}
	
	private static boolean checkSymmetry(String num) {
		boolean isSym = true;
		for (int i = 0, t = num.length()-1; i < num.length()/2; i++, t--) {
			char digit1 = num.charAt(i);
			char digit2 = num.charAt(t);
			if (digit1 != digit2) {
				isSym = false;
			}
		}
		
		return isSym;
	}

}
