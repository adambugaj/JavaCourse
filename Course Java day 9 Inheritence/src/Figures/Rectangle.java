package Figures;

public class Rectangle extends Figure {

		protected float width;
		protected float height;
		
		public Rectangle(float x, float y, float width, float height) {
			super(x, y);
			this.width = width;
			this.height = height;
		}
		
		public void draw() {
			System.out.println("Width + Height= " + (this.width + this.height));
		}
		
		
}
