import java.util.Locale;
import java.util.Scanner;

public class _3_PointsInsideFigure {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Input x-coordinate: ");
		double x = inp.nextDouble();
		inp.nextLine();
		System.out.print("Input y-coordinate: ");
		double y = inp.nextDouble();
		inp.nextLine();
		boolean isInside = false;
		
		if ((y >= 6 && y <= 8.5) && (x >= 12.5 && x <= 22.5)) {
			isInside = true;
		}
		if (y >= 8.5 && y <= 13.5 && x >= 12.5 && x <= 17.5) {
			isInside = true;
		}
		if (y >= 8.5 && y <= 13.5 && x >= 20 && x <= 22.5) {
			isInside = true;
		}
		
		if (isInside) {
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
		//main(args);
	}
}
