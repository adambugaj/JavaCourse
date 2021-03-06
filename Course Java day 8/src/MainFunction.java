import java.util.function.Function;

public class MainFunction {
	
	public static void main(String[] args) {
		/*Function<Double, Double> f = new FunctionObject();
		System.out.print(f.apply(32.0));*/
		
		Function<Double, Double> d = new Function<Double, Double>() {
			public Double apply(Double arg) {
				return arg * arg;
			}
		};
		
		// Wyra�enie lambda
		//Function<Double, Double> f = x -> x * x;
		
		System.out.println(d.apply(31.0));
	}
}