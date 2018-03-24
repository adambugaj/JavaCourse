import java.util.Random;
import java.util.Scanner;

public class ChristmassTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numUser;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Type the number: ");
		numUser = scanner.nextInt();
		System.out.println("Type the number of Column: ");
		int numColumn = scanner.nextInt();
		System.out.println("Your number is " + numUser);

		Random random = new Random();
		
		
		for (int i = 0; i < numColumn;) {
			// for (int j = 0; j < i + 1; j++) - without i++
			for (int j = 0; j < i; j++) {
				
				if (random.nextInt(25) < 5) {
					System.out.print("o");
				} else {
					System.out.print("*");
				}
				
			}
			i++;
			System.out.println("");
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("**");
		}

		// for(int j = 0; j < 5;) {
		// System.out.print("*");
		// j++;
		// }

	}

}
