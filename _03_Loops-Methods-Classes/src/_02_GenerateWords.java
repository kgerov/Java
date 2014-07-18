import java.util.Scanner;


public class _02_GenerateWords {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter sequence: ");
		String seq = inp.nextLine();
		for (int i = 0; i < seq.length(); i++) {
			for (int j = 0; j < seq.length(); j++) {
				for (int j2 = 0; j2 < seq.length(); j2++) {
					System.out.printf("%s%s%s ",seq.charAt(i), seq.charAt(j), seq.charAt(j2));
				}
			}
		}

	}

}
