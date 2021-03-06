import java.util.*;

public class ColorsData {
	public static void main(String args[]) {
		task2();
		
		String colors[] = {"red", "green", "blue"};
		List<String> colorList = new LinkedList<>();
		
		// Number bez kolejnosci
		Set<String> hashSet = new HashSet<>();
		// Wartosci z kolejnosciš dodania
		Set<String> linkedSet = new LinkedHashSet<>();
		// Wartosci z kolejnoscia alfabetyczna
		Set<String> treeSet = new TreeSet<>();
		
		// Add to list
		for (String color : colors) {
			colorList.add(color);
			hashSet.add(color);
			linkedSet.add(color);
			treeSet.add(color);
		}
		
		for (String color : hashSet) {
			System.out.println("Hash Collection: " + color + " ");
		} System.out.println();
		
		for (String color : linkedSet) {
			System.out.println("Linked Collection: " + color + " ");
		} System.out.println();
		
		for (String color : treeSet) {
			System.out.println("Alphabetical: " + color + " ");
		}
	}
	
	private static void task2() {
		Set<Integer> zbiorLiczb = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			zbiorLiczb.add(i *4);
		}
		
		for(Integer number : zbiorLiczb) {
			System.out.print(number + " ");
		}
	}
}
