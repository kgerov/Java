package _01_Geometry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Tester {

	public static void main(String[] args) {		
		Triangle gosho = new Triangle(15, 15, 28, 18, 23, 30);
		Rectangle kesh = new Rectangle(4, 5, 10, 20);
		Circle yolo = new Circle(0, 0, 5);
		SquarePyramid pesho = new SquarePyramid(4, 5, 2, 5, 9);
		Cuboid goshence = new Cuboid(2, 4, 1, 5, 1, 2);
		Sphere sfrecho = new Sphere(4, 5, 1, 5);
		
		List<Shape> figures = new ArrayList<Shape>();
		figures.add(gosho);
		figures.add(pesho);
		figures.add(goshence);
		figures.add(sfrecho);
		figures.add(kesh);
		figures.add(yolo);
		
		System.out.println("All shapes");
		printShapes(figures);
		
		System.out.println("\n");
		
		System.out.println("VolumeMeasurable with volume bigger than 40");
		figures.stream().filter(e -> e instanceof VolumeMeasurable)
	    				.filter(e -> ((VolumeMeasurable) e).getVolume() > 40)
	    				.forEach(e -> System.out.println(e));
		
		System.out.println("\n");
		
		Comparator<Shape> PerimeterCompare = (f1, f2) -> {
			PerimeterMeasurable S1 = (PerimeterMeasurable) f1;
			PerimeterMeasurable S2= (PerimeterMeasurable) f2;
			
			return S1.Perimeter() < S2.Perimeter() ? -1 :
				S1.Perimeter() > S2.Perimeter() ? 1 : 0;		
		};
		
		System.out.println("Plane Shapes in perimeter ascending order");
		figures.stream().filter(e -> e instanceof PerimeterMeasurable)
						.sorted(PerimeterCompare)
						.forEach(e -> System.out.println(e));
	}
	
	public static void printShapes(List<Shape> figures) {
		for (Shape shape : figures) {
			System.out.println(shape);
		}
	}
}
