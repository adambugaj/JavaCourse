import java.util.*;

public class DataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkPerson();

	}

	private static void checkPerson() {
		
		Set<Person> person = new TreeSet<>();
		
		Person michael = new Person("Michael", "Adrinn", 22);
		Person jessica = new Person("Jessica", "Willen", 25);
		Person adrin = new Person("Adrin", "Maken", 3);
		
		person.add(michael);
		person.add(jessica);
		person.add(adrin);
		
		
		
	}
	
}
