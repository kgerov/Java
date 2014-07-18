import java.util.Locale;
import java.util.Scanner;

public class _05_AngleUnitConverter {
	
	private static final double pi = 3.14159265358979323846;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner inp = new Scanner(System.in);
		System.out.print("Number of conversions: ");
		int n = inp.nextInt();
		double[] angles = new double[n];
		String[] measures = new String[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Enter angle: ");
			angles[i] = inp.nextDouble();
			measures[i] = inp.nextLine();
		}
		
		for (int i = 0; i < n; i++) {
			measures[i] = measures[i].trim();
			if (measures[i].equals("rad")) {
				System.out.printf("%.6f deg", ((angles[i]*180)/pi));
				System.out.println();
			}
			else {
				System.out.printf("%.6f rad", ((angles[i]*pi)/180));
				System.out.println();
			}
		}
		//main(args);
	}

}
