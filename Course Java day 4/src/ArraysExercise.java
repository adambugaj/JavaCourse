
public class ArraysExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int calcAdd = add(2, 6);
		int calcMulti = multiply(2,2);
		
		
		boolean checkNumber = checkInt(7);
		for (int i = 2; i < 100; i++) {
			if (checkInt(i)) {
				System.out.println(i);
			}
		}
		
		
		System.out.println(checkNumber);
		// System.out.format("1. %d\n 2. %d", calcAdd, calcMulti);
	}

	// Check if the number is integer (ca³kowita)
	static boolean checkInt( int n ) {
		boolean result = true;
		for (int i = 2; i < n; i++) {
			if ( n % i == 0 ) {
				// System.out.println(i);
				result = false;
				//return false;
			}
		}
		return result;
	}
	
	static int add(int a, int b) {
		int result = a + b;
		return result;
	}
	
	static int multiply(int a, int b) {
		int result = a * b;
		return result;
	}
}
