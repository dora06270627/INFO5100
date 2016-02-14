
public class Vehicle {
	private Vehicle type;
	private Vehicle  color;

	public enum Type {
		Bus, Motorcycle, Sedan, SUV, Truck
	}

	public enum Color {
		Blue, Red, Yellow, Green
	}

	public void setType(Vehicle type) {
		this.type = type;
	}
	
	public Vehicle getType() {
		return type;
	}
	
	public void setColor(Vehicle color) {
		this.color = color;
	}
	
	public Vehicle getColor() {
		return color;
	}
}
