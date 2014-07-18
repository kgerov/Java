import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class _4_SmallestNumberOfThree {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter 3 numbers: ");
		double[] nums = new double [3];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = inp.nextDouble();
		}
		
		Arrays.sort(nums);
		
		System.out.println("The smallest is: " + nums[0]);
		//main(args);
	}
}
