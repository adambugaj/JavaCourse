package Game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		playGame();
		userGuess();
	}
	public static int randomNumberComputer;
	public static int userNumber;
	
	public static void playGame() {
		Random random = new Random();
		randomNumberComputer = random.nextInt(100);
		//System.out.println("Computer chose number: " + randomNumberComputer);
		
	}
	
	public static void userGuess() {
		Scanner scanner = new Scanner(System.in);
		
		// System.out.println("Your number is " + userNumber);
		
		int numberTries = 0;
		while (numberTries < 10) {
			System.out.println("Proivde the number: ");
			try { 
				userNumber = scanner.nextInt();
				if (userNumber == randomNumberComputer) {
					System.out.println("You guessed the computer number");
					break;
				} else if (userNumber != randomNumberComputer){
					if (numberTries != 9) {
						System.out.println("Try again");
						if (userNumber > randomNumberComputer) {
							System.out.println("Your number " + userNumber + " is bigger than the computer number");
						} else if (userNumber < randomNumberComputer) {
							System.out.println("Your number " + userNumber + " is smaller than the computer number");
						}
					} else {
						System.out.println("Game over. No more chances");
					}
				}
				numberTries++;
				
			} catch(InputMismatchException e) {
				System.out.print("You typed string, please type number.");
				scanner.nextLine();
			}
			finally {
				
			}
		}	
	}
}

