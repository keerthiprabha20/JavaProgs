package transport;

public abstract class Vehicle {
	public Vehicle() {
        System.out.println("Vehicle() constructor called");
}
	public abstract void deliver(String item, String place);
}
