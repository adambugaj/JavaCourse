import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TotoLotek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		provideNumber();
		//System.out.print(countSameNumber);
		
	}

	static int userChoice;
	static int countSameNumber;
	
	private static void provideNumber() {
		
		// User input
		Integer[] userList = {2,32,4,44,22,7};
		List<Integer> userNumbers = Arrays.asList(userList);
	
		
		// Computer input
		Random random = new Random();
		Integer[] computerList = {random.nextInt(49), random.nextInt(49), random.nextInt(49), random.nextInt(49),random.nextInt(49),random.nextInt(49)};
		
		// Metoda bez new
		List<Integer> computerNumbers = Arrays.asList(computerList); 
		//System.out.println(computerNumbers.contains(userNumbers));
	
		
		countSameNumber = 0;
		int countLoops = 0;
		int numbersTrue = 0;
		
		while(countLoops < 1000000) {
			//computerChoice = random.nextInt(49);
			//Integer[] computerList = {random.nextInt(49), random.nextInt(49), random.nextInt(49), random.nextInt(49),random.nextInt(49),random.nextInt(49)};
			//List<Integer> computerNumbers = Arrays.asList(computerList);
			numbersTrue = 0;
			for (int i = 0; i < computerNumbers.size(); i++) {
				//System.out.println(computerNumbers.contains(userNumbers.get(i)));
				if (computerNumbers.contains(userNumbers.get(i))) {
					if (numbersTrue == 6) {
						System.out.println("6 wylosowana po: " + countLoops);
						break;
					} else {
						numbersTrue++;
						countLoops++;
					}
				} else {
					countLoops++;
				}
			}
		}
		
		System.out.println("Number loops: " + countLoops);
		System.out.println("Found: " + numbersTrue);
/*		Scanner scanner = new Scanner(System.in);
		
		List<Integer> numberList = new LinkedList<>();
		
		System.out.println("Provide 6 numbers:");
		
		userChoice = scanner.nextInt();
		
		System.out.println("Your number is " + userChoice);*/
		
	}
	
}
