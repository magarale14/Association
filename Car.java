
public class Car {
	
	private Wheel wheels;
	private Engine engine;
	private Seat seat;
		
	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", engine=" + engine + ", seat="
				+ seat + "]";
	}

	Car() {
		
	}
		
	
	Car(Engine e, Wheel w, Seat s) {
		this.engine = e;
		this.wheels = w;
		this.seat = s;
	}
	
	/*
	 * public Engine(double cylinderCapacity, String engineType,
			int numberOfCylinders, double horsePower) {
	 */
	public static void main(String[] args) {
		
		Car c = new Car(new Engine(1.8, "Petrol", 5, 250), new Wheel(34.5,"Tata", 24), new Seat("cotton","fur","mink","Fall",false, false,false,false));
				System.out.println(c);
				
	}

}