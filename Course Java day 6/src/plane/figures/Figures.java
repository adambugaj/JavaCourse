package plane.figures;

public class Figures {

	private float x = 0;
	private float y = 0;
	private float height = 0;
	private float width = 0;
	private int r;
	private int g;
	private float xy;
	private float vy;
	
	
	public Figures(float x, float y, float height, float width, int r, int g) {
		super();
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.r = r;
		this.g = g;
		this.xy = xy;
		this.vy = vy;
	}
	
	
	
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	
}
