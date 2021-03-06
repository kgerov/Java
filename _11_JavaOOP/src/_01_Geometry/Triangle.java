package _01_Geometry;

public class Triangle extends PlaneShape{
	
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		super(x1, y1);
		this.vertices[1] = new Vertex2D(x2, y2);
		this.vertices[2] = new Vertex2D(x3, y3);
	}

	@Override
	public double Area() {
		double[] sides = getSides();
		double p = (sides[0]+sides[1]+sides[2])/2;
		
		return Math.sqrt(p*(p-sides[0])*(p-sides[1])*(p-sides[2]));
	}

	@Override
	public double Perimeter() {
		double[] sides = getSides();
		
		return sides[0]+sides[1]+sides[2];
	}
	
	public double[] getSides() {
		double a = distance(vertices[0], vertices[1]);
		double b = distance(vertices[2], vertices[1]);
		double c = distance(vertices[2], vertices[0]);
		
		double[] sides = {a, b, c};
		
		return sides;
	}
	
	@Override
	public String toString() {
		return "Traingle. Area: " + this.Area() + ". Perimeter: " + this.Perimeter();
	}
}
