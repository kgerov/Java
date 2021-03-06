package _01_Geometry;

import java.util.ArrayList;
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
		
		System.out.println("Äll shapes");
		printShapes(figures);
		
		System.out.println("\n");


	}
	
	public static void printShapes(List<Shape> figures) {
		for (Shape shape : figures) {
			System.out.println(shape);
		}
	}
}
