package transport;

public class Bicycle extends Vehicle {

	public Bicycle() {
		super();
		System.out.println("Bicycle() constructor called");
	}

	@Override
	public void deliver(String item, String place) {
		System.out.println("Delivering"+ item + "to"+ place + "by Bicycle.");

	}

}
