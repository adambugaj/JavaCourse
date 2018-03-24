import java.util.Scanner;

public class NumberMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercise1();
	}
	
	private static void exercise1() {
		int numFirst;
		int numSecond;
		int numThird;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Type first number: ");
		numFirst = userInput.nextInt();
		System.out.println("Type second number: ");
		numSecond = userInput.nextInt();
		System.out.println("Type third number: ");
		numThird = userInput.nextInt();
		
		System.out.println(numFirst);
		
		int calc = (numFirst + numSecond);
		System.out.println(calc);
		
//		System.out.println("Max = " Math.max(numFirst, Math.max(numSecond, Math.max(arg0, arg1)))
		System.out.println(numFirst > numSecond);
		if (numFirst > numSecond) {
			if (numFirst >= numThird) {
				System.out.println(numFirst);
			} else {
				System.out.println(numThird);
			}
		}
				/*if (numSecond > numThird) {
					System.out.println(numSecond);
					if (numThird > numFirst) {
						System.out.println(numThird);
					}
				}*/
		else if (numSecond >= numThird) {
			if (numSecond >= numFirst) {
				System.out.println(numSecond);
			}
		}
		else if (numThird >= numSecond) {
			if (numThird >= numFirst) {
				System.out.println(numThird);
			}
		}
		
//		if (numFirst > numSecond && num)
		
		int b;
		int x;
		int y;
		int z;
		z = numFirst;
		y = numSecond;
		x = numThird;
		
		
		if (x > y) {
			b = y;
			y = x;
			x = b;
		}
		if (y > z) {
			b = z;
			z = y; 
			y = b;
		}
		if (x > y) {
			b = y;
			y = x;
			x = b;
		}
		
		//System.out.format("%f %f %f\n", x, y, z); f only with double and float 0.00
		
		System.out.format("%d %d %d\n", x, y, z);
		
		// Data - ternary operators
		z = numFirst;
		y = numSecond;
		x = numThird;
		
		int calcX = (x > y && x > z) ? ((y > z && y > x) ? y : z) : ((z > y && z > x) ? z : y);
		
		
		System.out.println("Ternary operator: " + calcX);
		
		
		userInput.close();
	}
	
	
}
