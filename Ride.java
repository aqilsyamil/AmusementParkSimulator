package task1;

public class Ride {
	private String rideName;
	private String rideStatus;
	private double rideHeightLimit;
	private Park park;
	
	public Ride() {
	}
	
	public Ride(String rideName, String rideStatus, double rideHeightLimit, Park park) {
		super();
		this.rideName = rideName;
		this.rideStatus = rideStatus;
		this.rideHeightLimit = rideHeightLimit;
		this.park = park;
	}

	public String getRideName() {
		return rideName;
	}

	public void setRideName(String rideName) {
		this.rideName = rideName;
	}

	public String getRideStatus() {
		return rideStatus;
	}

	public void setRideStatus(String rideStatus) {
		this.rideStatus = rideStatus;
	}

	public double getRideHeightLimit() {
		return rideHeightLimit;
	}

	public void setRideHeightLimit(double rideHeightLimit) {
		this.rideHeightLimit = rideHeightLimit;
	}

	public Park getPark() {
		return park;
	}

	public void setPark(Park park) {
		this.park = park;
	}

	public void updateRide() {
		// update ride
	}
}
