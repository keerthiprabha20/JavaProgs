package transport;

public class Drone extends Vehicle implements IPayable {

	public Drone() {
		super();
		System.out.println("Drone() constructor called");
	}

	@Override
	public void deliver(String item, String place) {
		if (!SecurityRules.canFly(place)) {
			System.out.println("Delivery to" + place + "is blocked by security.");
			return;
		}
		System.out.println("Delivering" + item + "to"+ place+ "by Drone");   
		}
@Override
public double cost(double distanceKm) {
	return distanceKm*20.0;
	}
}