package ExercisesInheritence;

public class MultiCar extends Car {

	protected int numberWeight;
	
	
	public MultiCar(int numberWheel, String nameOfCar, int numberOfDoors, int numberWeight) {
		super(numberWheel, nameOfCar, numberOfDoors);
		this.numberWeight = numberWeight;
		
		
	}
	
	public void showWeight() {
		System.out.println("The weight of a car is: " + this.numberWeight);
	}
	
	public String changeNameOfCar() {
		return "";
	}
	
}
