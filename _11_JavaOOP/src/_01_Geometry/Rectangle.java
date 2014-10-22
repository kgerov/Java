package _01_Geometry;

public class Rectangle extends PlaneShape{
	private double width;
	private double height;
	
	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double Area() {
		return width*height;
	}

	@Override
	public double Perimeter() {
		return 2*(width+height);
	}

	@Override
	public String toString() {
		return "Rectangle. Area: " + this.Area() + ". Perimeter: " + this.Perimeter();
	}
}
