
public class ExerciseDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[10];
		array[0] = 3;
		array[1] = 4;
		array[2] = 1;
		
		System.out.println(array[2]);
		for (int i = 0; i < 3; i++) {
			System.out.println(" Your number of arrays" + array[i]);
		}
		
		
		// exercises 1 with 3 and 7
		for(int i = 100; i > 0; i = i - 2) {
			System.out.println("All " + i);
			if (i % 3 == 0) {
				System.out.println("3 can be devided by " + i);
			}
			if (i % 7 == 0) {
				System.out.println("7 can be devided by " + i);
			}
		}
	}
}
