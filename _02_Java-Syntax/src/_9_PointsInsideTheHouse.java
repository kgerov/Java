import java.util.Locale;
import java.util.Scanner;

public class _9_PointsInsideTheHouse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Enter two points: ");
		double x = inp.nextDouble();
		double y = inp.nextDouble();
		
		boolean isInside = false;
		
		double x1 = 12.5, x2 = 17.5, x3 = 22.5;
		double y1 = 8.5, y2 = 3.5, y3 = 8.5;
		
		double Area = Math.abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1-y2))/2);
		double Area1 = Math.abs((x*(y2 - y3) + x2*(y3 - y) + x3*(y-y2))/2);
		double Area2 = Math.abs((x1*(y - y3) + x*(y3 - y1) + x3*(y1-y))/2);
		double Area3 = Math.abs((x1*(y2 - y) + x2*(y - y1) + x*(y1-y2))/2);
		
		if (Area == Area1 + Area2 + Area3) {
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
		main(args);
		
		
	}
}
