import java.util.Random;

public class Matres {

	// Write out Integers
	static void printMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	// Write out Strings
	/*static void printStrings(Strings matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
	*/
	static void fillMatrix(int matrix[][]) {
		Random random = new Random(20);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(20);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[3][4];
		fillMatrix(matrix);
		printMatrix(matrix);
		
		int[][] numbers = {{1,3,4},{1,3,5}};
		String[][] names = {{"Mathew","Conor"},{"Mat","Damon"}};
		System.out.println(numbers[1][2]);
		System.out.println(names[1][1]);
		//printStrings(names);
		}
	}
