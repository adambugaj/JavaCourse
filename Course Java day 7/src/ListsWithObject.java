import java.util.Arrays;
import java.util.*;

public class ListsWithObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lists();
	}
	
	public static void lists() {
		List<Person> peopleList = new LinkedList<>();
		
		Person firstPerson = new Person("Peter", "Johnson", 23);
		Person secondPerson = new Person("Brownie","Milane", 21);
		Person thirdPerson = new Person("Jane","Milane", 21);
		peopleList.add(firstPerson);
		peopleList.add(secondPerson);
		peopleList.add(thirdPerson);
		
		for(Person name : peopleList) {
			System.out.println("Name from forEach: " + name.getFirstName());
		}
		
		//peopleList.add(firstPerson);
		// not objects, only strings add with asList
		//List<String> name2 = new LinkedList<>(Arrays.asList(secondPerson, thirdPerson));
		
		// System.out.println(peopleList.get(1).firstName);
		
		//Iterator<Person> getPeople = peopleList.iterator();
		for (int i = 0; i < peopleList.size(); i++) {
			System.out.println("Name from for loop: " + peopleList.get(i).firstName);
		}
		
	}
	
	
	

}
