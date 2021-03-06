package _01_Geometry;

public class Circle extends PlaneShape {
	private double radius;

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double Area() {
		return Math.PI*this.radius*this.radius;
	}

	@Override
	public double Perimeter() {
		return this.radius*2*Math.PI;
	}

	@Override
	public String toString() {
		return "Circle. Area: " + this.Area() + ". Perimeter: " + this.Perimeter();
	}
}
