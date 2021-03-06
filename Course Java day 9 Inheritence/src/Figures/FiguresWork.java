package Figures;

import java.util.ArrayList;
import java.util.List;

public class FiguresWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Figure> figures = new ArrayList<>();
		
		
		figures.add(new Rectangle(10, 10, 10, 10));
		figures.add(new Circle(15, 13, 16));
		
		//Rectangle rectangle = new Rectangle(10, 10, 10, 10);
		//rectangle.draw();
		
		for (Figure figure : figures) {
			figure.draw();
		}
		
		ShowDataFigures.showFigures(figures);
	}

}
