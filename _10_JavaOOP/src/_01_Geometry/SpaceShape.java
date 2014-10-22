package _01_Geometry;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
	
	public SpaceShape(double x, double y, double z) {
		this.vertices = new Vertex3D[1];
		vertices[0] = new Vertex3D(x, y, z);
	}
	
	@Override
	public void setVertices(Vertex[] vertices) {
		for (Vertex vertex : vertices) {
			if(vertex.getClass().getName() != "_01_Geometry.Vertex3D"){
				throw new IllegalArgumentException("Space Shapes support only 3D vertices");
			}
		}
		
		this.vertices = vertices;
	}

	@Override
	public abstract double getVolume();

	@Override
	public abstract double Area();
}
