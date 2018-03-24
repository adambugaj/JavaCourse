package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Show the number: ");
		
		do {
			System.out.println("Give the number: ");
			try {
				double data = scanner.nextDouble();
				System.out.println("You typed: " + data);
				break;
			} catch (InputMismatchException ex) {
				System.out.println("You typed string");
				// czyszczenie skanera z b³êdnych znaków
				scanner.nextLine();
			}
		} while(true);

	}
}
