import java.util.function.Function;
import java.util.function.Predicate;

interface Funkcja {
	public double oblicz(double x);
}

class FKwadrat implements Funkcja {
	public double oblicz(double x) {
		return x * x;
	}
}

class Person {
	private int age;
	private String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		
	}
	
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}

public class ex1 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Funkcja f = new FKwadrat();
		System.out.println(f.oblicz(2.0));
		
		Function<Double, Double> f2 = x -> x * x;
		System.out.println(f2.apply(3.0));
		
		Predicate<Person> starszy = p -> p.getAge() >= 60;
		Function<Person, String> daneOsobowe = p -> {
			return p.getName() + " wiek: " + p.getAge();
		};
		
		System.out.println(daneOsobowe.apply(new Person(20, "Micha³")));	
	}

}
