package task1;

public class Operator extends Staff {
	private Ride ride;

	public Operator() {
		super();
		this.ride = new Ride();
	}

	public Operator(String fullName, String email, String password, Park park, String staffID, String staffStatus, Ride ride) {
		super(fullName, email, password, park, staffID, staffStatus);
		this.ride = ride;
	}

	public Ride getRide() {
		return ride;
	}

	public void setRide(Ride ride) {
		this.ride = ride;
	}

	public void updateStatusRide() {
		// method to update status ride
	}
	
}
