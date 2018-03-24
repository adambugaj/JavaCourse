package Bicycle;

import java.util.LinkedList;
import java.util.List;

public class CollectionsBike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Bicycle> bikes = new LinkedList<>();
		bikes.add(new RoadBike(20, 20, 20, 20, true));
		bikes.add(new MountainBike(10, 10, 10, 10));
		
		for( Bicycle bike : bikes) {
			System.out.println(bike);
			bike.speedUp(2);
			System.out.println(bike.showSpeed());
		}
		
		
	}

}
