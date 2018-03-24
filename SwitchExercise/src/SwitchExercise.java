import java.util.Scanner;

public class SwitchExercise {
	public static void main(String args[]) {
	//	exercise1();
		calculator();
	}
	
	private static void exercise1() {
		int number = 1;
		switch (number) {
		case 1: 
			System.out.format("Your number is %d", number);
			break;
		}
	}
	
	private static void calculator() {
		int numFirst;
		int numSecond;
		char symbol = 'x';
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Type first number: ");
		numFirst = scanner.nextInt();
		System.out.println("Type second number: ");
		numSecond = scanner.nextInt();
		System.out.println("Type symbol (+, -, *): ");
		
		// Clear enter by doing this line:
		scanner.nextLine();
		//symbol = scanner.next();
		symbol = scanner.nextLine().charAt(0);
		
		// switch can be withou {}, but variables must be different
		switch(symbol) {
			case '+': {
				int result = numFirst + numSecond;
				System.out.format("The result is %d", result);
				break;
			}
			case '-': {
				int result = numFirst - numSecond;
				System.out.format("The result is %d", result);
				break;
			} 
			case '*': {
				int result = numFirst * numSecond;
				System.out.format("The result is %d", result);
				break;
			}
			default: {
				System.out.println("Nothing typed");
			}
		}
		
	}
}
