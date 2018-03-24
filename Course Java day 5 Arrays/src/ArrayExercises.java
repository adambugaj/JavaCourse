import java.util.Random;

public class ArrayExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numUser = new int[25];
		setNumbers(numUser);
		
		reverseNumbers(numUser);
		//System.out.println(reverseNumbers(numUser));
		
	}
	
		private static void setNumbers(int[] numUser) {
			Random random = new Random();
			for (int i = 0; i < numUser.length; i++) {
				numUser[i] = random.nextInt(20); //random.nextInt(20);
				System.out.print(numUser[i] + " |");
			}
			System.out.println();
			
		}
		private static void reverseNumbers(int[] numUser) {
			int firstNum = numUser.length -1;
			for (int i = numUser.length -1; i > -1; i--) {
				
				numUser[firstNum] = numUser[i];
				
				// System.out.print(firstNum - 1 );
				System.out.print(numUser[i] + " |");
				
					firstNum += -1;
			}
		}
		
	}
