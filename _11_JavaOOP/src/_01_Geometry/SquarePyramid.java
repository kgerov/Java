package _01_Geometry;

public class SquarePyramid extends SpaceShape {
	private double width;
	private double height;
	
	public SquarePyramid(double x, double y, double z, double width,
			double height) {
		super(x, y, z);
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
	public double getVolume() {
		return width*width*height/3;
	}

	@Override
	public double Area() {
		double latHeight = Math.sqrt(Math.pow(Math.sqrt(2)*width/2, 2) + Math.pow(height, 2));
		return width*width + 2*width*latHeight;
	}

	@Override
	public String toString() {
		return "Sqare Pyramid. Area: " + this.Area() + ". Volume: " + this.getVolume();
	}
}
