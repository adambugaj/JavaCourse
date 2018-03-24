package ExercisesInheritence;

public abstract class Car {
	protected int numberWheel;
	protected int numberOfDoors;
	protected String nameOfCar;
	
	public Car(int numberWheel, String nameOfCar, int numberOfDoors) {
		this.nameOfCar = nameOfCar;
		this.numberWheel = numberWheel;
		this.numberOfDoors = numberOfDoors;
	}
	
	public abstract void showWeight();
	
	public void showNumberOfWheel() {
		System.out.println("The number of wheels is: " + numberWheel);
	}
	
	public void showNumberOfDoors() {
		System.out.println("The number of doors is: " + this.numberOfDoors);
	}
	
}
