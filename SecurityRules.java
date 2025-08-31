package transport;

public final class SecurityRules {

	private SecurityRules() {}
	
	public static boolean canFly(String place) {
		if("ExamCell".equalsIgnoreCase(place)) {
			return false;
		}
		return true;
	}
}
