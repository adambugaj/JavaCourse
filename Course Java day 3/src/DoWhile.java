
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whileLoop();
		doWhileLoop();
		
	}
		private static void whileLoop() {
			int i = 0;
			while( i < 10 ) {
				System.out.println(i);
				i += 2;
				if (i % 3 == 0 || i % 7 == 0) {
					System.out.println("Devided by 3 or 7: " + i);
				}
			}
		}
		private static void doWhileLoop() {
			int i = 10;
			do {
				if (i % 3 == 0) {
					System.out.println("doWhile:" + i);
				} 
				i--;
			} while(i > 0);
		}
}
