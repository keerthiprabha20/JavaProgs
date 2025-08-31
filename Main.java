import transport.*;

public class Main {

	public static void main(String[] args) {
		EBike ebike = new EBike();
		ebike.deliver("Pizza", "Library");
		
		Drone drone = new Drone();
		drone.deliver("USB","ExamCell" );
	}
}