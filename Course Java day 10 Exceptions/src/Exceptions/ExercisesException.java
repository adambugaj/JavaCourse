package Exceptions;

import java.util.Random;
import java.util.Scanner;

public class ExercisesException {

	public static void main(String[] args) throws MakeException {
		// TODO Auto-generated method stub
		//throw new MakeException();
/*		
		try {
			methodWithExcept();
		}*/
		
	}
	
	private static void methodWithExcept() throws MakeException {
		Random random = new Random();
		if ( random.nextInt(10) < 2 ) {
			Scanner scanner = null;
			scanner.nextLine();
			//throw new MakeExceptions();
			
		}
		
	}

}
