import java.util.Scanner;

public class _1_RectangleArea {

	public static void main(String[] args) {
		Scanner inp = new Scanner (System.in);
		
		System.out.print("Enter side a: ");
		int a = inp.nextInt();
		inp.nextLine();
		System.out.print("Enter side b: ");
		int b = inp.nextInt();
		inp.nextLine();
		
		System.out.println("The rectangle area is: " + (a*b));
		
	}

}
