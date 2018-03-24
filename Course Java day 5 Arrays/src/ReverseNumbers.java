import java.util.Random;

public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tab[] = new int[10];
		fillWithRandomNumbers(tab);
		printArr(tab);
		reverseWithNumbers(tab);
	}
	
	// Write out all numbers
	private static void printArr(int[] tab) {
		for (int i = 1; i < tab.length; i++) {
			System.out.print(tab[i]);
			
		}
	}


	private static void fillWithRandomNumbers(int[] tab) {
		// TODO Auto-generated method stub
		Random random = new Random();
		for (int i = 1; i < tab.length; i++) {
			tab[i] = random.nextInt(20);
		}
	}

	static void reverseWithNumbers(int[] arr) {
		int traingle = arr.length -1;
		for (int i = 0; i < arr.length / 2; i++) {
			int save = arr[i];
			arr[i] = arr[traingle];
			arr[traingle] = save;
			traingle++;
		}
	}
	
	

}
