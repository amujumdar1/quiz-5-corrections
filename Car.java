public class Car {
	private String make;
	private String model;
	private int speed;
	private double fuelLevel;
	
	public Car() {
		this.make = "Bugatti";
		this.model = "Chiron";
		this.speed = 246;
		this.fuelLevel = 241;
	}
	/* Hypothetical main method below
	 * public static void main(String[] args) {
		Car car = new Car("Bugatti", "Chiron", 246, 241);
		System.out.println(car.drive(5500, 241));
	}*/
	
	public Car(String make, String model, int speed, double fuelLevel) {
		this.make = make;
		this.model = model;
		this.speed = speed;
		this.fuelLevel = fuelLevel;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	
	public boolean drive(double miles, int speed) {
		
		if (fuelLevel < (miles / 20)) return false;
		// default fuel efficiency is 20 miles per gallon
		
		if (speed != this.speed) {
			this.accelerate(speed - this.speed);
			// adjusts existing speed if not equal
		}
                fuelLevel -= (miles / 20);
    
		return true;
	}
	public int accelerate(int difference) {
		return (this.speed += difference);
		// changes current speed by any difference
	}
	
	@Override
	
	public String toString() {
	// creates preferable String for the object itself
		return "{ Make: " + this.make + ", Model: "+ this.model
				+ ", Speed: "+ this.speed + ", Fuel: "+ this.fuelLevel
				+ " }";
	}
	
}
