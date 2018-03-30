import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// imiona bez loopo
public class Exercises2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String names[] = {"Micha³", "Pawe³", "Peter", "Monika"};
		Integer ages[] = {21, 23, 10, 20};
		
		List<Person> osoby = new LinkedList<>();
		
		for (int i = 0; i < names.length; i++) {
			osoby.add(new Person(ages[i], names[i]));
		}
		
		// zwraca ³
		osoby.stream()
			.filter(p -> p.getName().contains("³"))
			.forEach(o -> System.out.println(o.getName()));
	
		// zwraca i
		List<String> imiona = osoby.stream()
			.filter(o -> o.getName().contains("i"))
			.map(o -> o.getName())
			.sorted()
			//.forEach( imie -> System.out.println("Stream2 " + imie))
			.collect(Collectors.toList());
		
		imiona.forEach( imie -> System.out.println(imie));
		
		// zwraca najstarsz¹ osobe
		osoby.stream()
			.sorted( (p, q) -> {
				if (p.getAge() < q.getAge()) return 1;
				if (p.getAge() > q.getAge()) return -1;
				return 0;
			})
			.findFirst()
			.ifPresent(p -> System.out.println("The oldest person is: " + p.getName() + " with age of " + p.getAge()));
		
		osoby.stream()
			.filter(p -> p.getAge() >= 20 && p.getAge() <= 60 )
			.mapToDouble( Person::getAge )
			.average()
			.ifPresent( System.out::println);
			
	}

}
