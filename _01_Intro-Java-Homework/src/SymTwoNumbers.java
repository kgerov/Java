import java.util.Scanner;


public class SymTwoNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Number 1: ");
		int num1 = input.nextInt();
		input.nextLine();
		System.out.print("Number 2: ");
		int num2 = input.nextInt();
		input.nextLine();
		
		System.out.println("The sum is: " + (num1+num2));
		
	}

}
