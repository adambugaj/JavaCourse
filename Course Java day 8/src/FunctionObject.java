
import java.util.function.Function;

public class FunctionObject implements Function<Double, Double> {
	
	public Double apply(Double arg) {
		return arg * arg;
	}
	
}
