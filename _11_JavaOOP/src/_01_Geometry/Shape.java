package _01_Geometry;

public abstract class Shape {
	protected Vertex[] vertices;

	public Vertex[] getVertices() {
		return vertices;
	}

	public void setVertices(Vertex[] vertices) {
		this.vertices = vertices;
	}
}
