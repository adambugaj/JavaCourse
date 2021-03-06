import java.util.*;
import java.util.Map.Entry;
//import java.util.Map.Collections;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ex1();
		ex2();
		ObjectEx();*/
		compareToMethod();
		
	}
	
	private static void compareToMethod() {
		List<Car> cars = new LinkedList<>();
		cars.add(new Car("Red", 120, 2, 2));
		cars.add(new Car("Green", 1, 2, 1));
		cars.add(new Car("Green", 118, 2, 4));
		cars.add(new Car("Blue", 132, 2, 7));
		
		//java.util.Collections.sort(cars, new CarComparator()); from class CarComparator
		java.util.Collections.sort(cars, new Comparator<Car>() {
			public int compare(Car car1, Car car2) {
				if (car1.getPassangersCount() < car2.getPassangersCount()) return -1;
				if (car1.getPassangersCount() < car2.getPassangersCount()) return 1;
				return 0;
			}
		});
		
		java.util.Collections.sort(cars, (cL, cR) -> {
			return (int) Math.signum(cL.getPassangersCount() - cR.getPassangersCount());
		});
		
		for( Car car : cars) {
			System.out.println(car);
		}
		
//		for (Entry<String, Car> entry : cars.entrySet) {
//			System.out.format("%s : %s\n", entry.getKey(), entry.getValue());
//		}	
		
	}
	
	
	// Wyswietl rejestracje i w�asciowsci samochodu
	private static void ObjectEx() {
		
		Map<String, Car> cars = new HashMap<>();
		cars.put("AKD 123as", new Car("Red", 120, 2, 3));
		cars.put("WDA 12asd", new Car("Green", 123, 2, 5));
		cars.put("KRS 122as", new Car("Blue", 132, 2, 4));
		
		for(Car car : cars.values()) {
			System.out.println(car);
		}
		
		for(String ca : cars.keySet()) {
			System.out.println(ca + ":" + cars.get(ca).getColor());
		}
		
		// to samo co toString metoda
		for (Entry<String, Car> entry : cars.entrySet()) {
			System.out.format("%s : %s\n", entry.getKey(), entry.getValue());
		}	
		
	}
	
	
	
	private static void ex1() {
		
		Map<String, Integer> sprzeda� = new HashMap<>();
		
		sprzeda�.put("AUDI", 3);
		sprzeda�.put("BMW", 7);
		
		for (String key : sprzeda�.keySet()) {
			System.out.println(key + " " + sprzeda�.get(key));
		}
		
		int totalSale = 0;
		for(Integer value : sprzeda�.values()) {
			totalSale += value;
		}
		System.out.println("Ca�o��: " + totalSale);
	}
	
	private static void ex2() {
		
		Map<Integer, String> blok = new HashMap<>();
		blok.put(1, "Michael Wi�niewski");
		blok.put(2, "Monica Flower");

		Iterator<Integer> it = blok.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " " + blok.get(key));
		}
		// System.out.println(blok.get(2));
		
	}
	
}
