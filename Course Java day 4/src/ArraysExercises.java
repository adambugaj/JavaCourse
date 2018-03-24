import java.util.Random;

public class ArraysExercises {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(arrayEx(6));
		int[] numberArr = new int[20];
		createArr(numberArr);
		showNumbers(numberArr);
		
		int sum = returnSum(numberArr);
		System.out.print(sum);
		
		int maxNumber = findMax(numberArr);
		System.out.println("Max number is " + maxNumber);
		
		randomNumbers(numberArr);
		
	}
		
	private static int findMax(int[] numberArr) {
		// TODO Auto-generated method stub
		int num = numberArr[0];
		for (int i = 1; i < numberArr.length; i++) {
			System.out.println(numberArr[i]);
			if (numberArr[i] > num) {
				num = numberArr[i];
			}
		}
		
		return num;
	}

	static void createArr(int[] arr) {
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(200)-100;
		}
		System.out.print(arr[4]);
	}
	
	private static void showNumbers(int[] numberArr) {
		for(int i = 0; i < numberArr.length; i++) {
			System.out.println(numberArr[i]);
		}
		
	}
	
	private static int returnSum(int[] numberArr) {
		int sum = 0;
		for (int j = 0; j < numberArr.length; j++) {
			sum += numberArr[j];
			//sum = sum + numberArr[j];
		}
		return sum;
	}
	
	static void randomNumbers(int[] arr) {
		Random random = new Random();
		for ( int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(200)-100;
			System.out.println(i);
		}
	}
	
/*	static int arrayEx(int num) {
		
		int numbers[] = new int[num];
		for (int i = 1; i < num; i++) {
			 numbers[i] = i;	 
		}
		return numbers[2];
	}*/
}
