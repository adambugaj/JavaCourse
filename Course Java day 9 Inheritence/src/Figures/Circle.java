package Figures;

public class Circle extends Figure {

	protected float radius;
	
	public Circle(float x, float y, float radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("Radius is " + this.radius);
	}
	
	public String toString() {
		return "Circle [radius=" + radius + ", x=" + x + ", y=" + y + "]";
	}
	
}
