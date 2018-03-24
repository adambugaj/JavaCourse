import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collections {

	public static void main(String args[]) {
		ExercisesWithLists();
	}
	
	// Exercise with Object
	
	
	// Exercise with lists
	public static void ExercisesWithLists() {
		List<String> names = new LinkedList<>();
		names.add("Peter");
		names.add("Alice");
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		
		for(String name : names) {
			System.out.print(names);
		}
	}
}
