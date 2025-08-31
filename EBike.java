package transport;

public class EBike extends Bicycle {
	private int battery = 50;

	public EBike() {
		super();
		System.out.println("EBike() constructor called");
		
	}
@Override
public void deliver(String item, String place) {
	System.out.println("Checking battery:"+battery+"%");
	super.deliver(item, place);
}
}