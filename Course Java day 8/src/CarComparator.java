import java.util.*;

public class CarComparator implements Comparator<Car> {

	public int compare(Car car1, Car car2) {
		if (car1.getPassangersCount() < car2.getPassangersCount()) return -1;
		if (car1.getPassangersCount() < car2.getPassangersCount()) return 1;
		return 0;
	}
}
