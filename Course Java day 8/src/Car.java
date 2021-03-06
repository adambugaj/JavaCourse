
public class Car implements Comparable<Car> {
		
	private String color;
	private double weight;
	private double capacity;
	private int passangersCount = 0;
	
	public Car(String color, double weight, double capacity, int passangersCount) {
		this.color = color;
		this.weight = weight;
		this.capacity = capacity;
		this.passangersCount = passangersCount;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getPassangersCount() {
		return passangersCount;
	}

	public void setPassangersCount(int passangersCount) {
		this.passangersCount = passangersCount;
	}

	public String toString() {
		return "Car [color= " +  color + " weight= " + weight + " passengers= " + passangersCount + "]";
	}
	
	public int compareTo(Car car) {
		// TODO Auto-generated method stub
		if(this.weight < car.weight) return -1;
		if(this.weight > car.weight) return 1;
		return 0;
	}
}