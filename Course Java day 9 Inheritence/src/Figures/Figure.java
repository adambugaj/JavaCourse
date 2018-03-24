package Figures;

public abstract class Figure {
	
	protected float x;
	protected float y;
	
	public Figure(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw();
	
}
