import java.util.Scanner;

public class LoopsExercises {
	public static void main(String[] args) {
		numberStar();
	}
	private static void numberStar() {
		
		int numUser;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type the number: ");
		numUser = scanner.nextInt();
		int numColumn = scanner.nextInt();
		System.out.println("Your number is " + numUser);
		
		
//		for(int i = 0; i <= numUser; i++) {
//			System.out.print("*");
//		} 
//		System.out.print("\n");
//		for(int j = 0; j <= numUser; j++) {
//			System.out.print("*");
//		}
//		System.out.print("\n");
//		for(int j = 0; j <= numUser; j++) {
//			System.out.print("*");
//		}
//		System.out.print("\n");
		
		// For lines
//		for(int i = 0; i <= numUser; i++) {
//			for (int j = 0; j <= numUser; j++) {
//				System.out.print("*");
//				for(int k = numUser; k > numUser - 1; k--) {
//					System.out.print("*");
//				}
//			} 
//			System.out.println();
//		} 
//		// First line
		for (int i = 0; i < numUser; i++) {
			System.out.print("*");
		}
		System.out.println();
		// Empty lines
		for(int i = 0; i < numColumn - 2; i++) {
			for(int j = 0; j < numUser - 1; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for (int i = 0; i < numUser; i++) {
			System.out.print("*");
		}
		
	}
}