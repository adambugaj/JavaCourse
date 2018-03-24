import java.util.Scanner;

public class ClassArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numFirstFromUser;
		int numSecondFromUser;
		char symbolFromUser = ',';
		
		
		
		// First number from User
		System.out.println("Type the first number: ");
		Scanner userInput = new Scanner(System.in);
		numFirstFromUser = userInput.nextInt();
		
		// Second number from User
		System.out.println("Type the second number: ");
		numSecondFromUser = userInput.nextInt();
		
		// User choice of char
		System.out.println("Choose one of the symbol: + , - , *, / ");
		// Only if symbolFromUser is a String!!
		// symbolFromUser = userInput.next();
		symbolFromUser = userInput.nextLine().charAt(0);
		System.out.println(symbolFromUser);
		char plus = '+';
		
		//System.out.format("symbolFromUser : %f", numFirstFromUser + numSecondFromUser);
		
		if (symbolFromUser == plus) {
			System.out.println(numFirstFromUser + " + " + numSecondFromUser + " = " + (numFirstFromUser + numSecondFromUser));
		} else if (symbolFromUser == '-'){
			System.out.println(numFirstFromUser + " - " + numSecondFromUser + " = " + (numFirstFromUser - numSecondFromUser));
		} else if (symbolFromUser == '*'){
			System.out.println(numFirstFromUser + " * " + numSecondFromUser + " = " + (numFirstFromUser * numSecondFromUser));
		}
		
		/* Only if symbolFromUser is a String!!!
		if (symbolFromUser.equals(plus)) {
			System.out.println(numFirstFromUser + " + " + numSecondFromUser + " = " + (numFirstFromUser + numSecondFromUser));
		} else if (symbolFromUser.equals("-")){
			System.out.println(numFirstFromUser + " - " + numSecondFromUser + " = " + (numFirstFromUser - numSecondFromUser));
		} else if (symbolFromUser.equals("*")){
			System.out.println(numFirstFromUser + " * " + numSecondFromUser + " = " + (numFirstFromUser * numSecondFromUser));
		}
		*/
		// Always close - good practice (close as fast as possible)
		userInput.close();
		
			
		
	}

}