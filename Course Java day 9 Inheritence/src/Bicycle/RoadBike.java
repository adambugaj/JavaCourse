package Bicycle;

public class RoadBike extends Bicycle {

	Boolean wheelType;
	
	public RoadBike(int startHeight,
	                int startCadence,
	                int startSpeed,
	                int startGear,
	                boolean wheelType) {
		super(startCadence, startSpeed, startGear);
		this.wheelType = wheelType;
	}
	
	public void speedUp(int increment) {
		if(wheelType == false) {
			super.speedUp(increment);
		} else {
			this.speed += 2 * increment;
		}
	}
	
	public int showSpeed() {
		return this.speed;
	}
	
}
