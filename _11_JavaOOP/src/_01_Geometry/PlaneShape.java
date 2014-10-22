package _01_Geometry;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable{
	
	public PlaneShape(double x, double y) {
		this.vertices = new Vertex2D[3];
		this.vertices[0] = new Vertex2D(x, y);
	}
	
	@Override
	public void setVertices(Vertex[] vertices) {
		for (Vertex vertex : vertices) {
			if(vertex.getClass().getName() != "_01_Geometry.Vertex2D"){
				throw new IllegalArgumentException("Plane Shapes support only 2D vertices");
			}
		}
		
		this.vertices = vertices;
	}
	
	public abstract double Area();

	public abstract double Perimeter();
	
	public static double distance(Vertex f, Vertex s) {
		Vertex2D a = (Vertex2D)f;
		Vertex2D b = (Vertex2D)s;
		return Math.sqrt(Math.pow((a.getX()-b.getX()), 2) + Math.pow((a.getY()-b.getY()), 2));
	}
}
