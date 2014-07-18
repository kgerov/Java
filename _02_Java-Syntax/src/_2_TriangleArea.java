
import java.util.Scanner;
import java.util.Arrays;

public class _2_TriangleArea {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int[] coor = new int[6];
		
		for(int i = 0, j = 0; i < 3; i++, j++) {
			System.out.print("Input x" + i + ": ");
			coor[j] = inp.nextInt();
			inp.nextLine();
			j++;
			System.out.print("Input y" + i + ": ");
			coor[j] = inp.nextInt();
			inp.nextLine();
		}
		
		double sideA = Math.sqrt(Math.pow((coor[0] - coor[2]), 2) + Math.pow((coor[1]-coor[3]), 2));
		double sideB = Math.sqrt(Math.pow((coor[0] - coor[4]), 2) + Math.pow((coor[1]-coor[5]), 2));
		double sideC = Math.sqrt(Math.pow((coor[2] - coor[4]), 2) + Math.pow((coor[3]-coor[5]), 2));
		double p = (sideA + sideB + sideC) / 2;
		
		if ((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideC + sideA > sideB)) {
			double area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
			System.out.println("The area is: " + Math.round(area));
		}
		else {
			System.out.println("0");
		}
		
		
		
	}

}
