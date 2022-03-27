package task1;

public class Staff extends User {
	private String staffID;
	private String staffStatus;
	
	public Staff() {
		super();
		this.staffID = "";
		this.staffStatus = "";
	}

	public Staff(String fullName, String email, String password, Park park, String staffID, String staffStatus) {
		super(fullName, email, password, park);
		this.staffID = staffID;
		this.staffStatus = staffStatus;
	}

	public String getStaffID() {
		return staffID;
	}

	public void setStaffID(String staffID) {
		this.staffID = staffID;
	}

	public String getStaffStatus() {
		return staffStatus;
	}

	public void setStaffStatus(String staffStatus) {
		this.staffStatus = staffStatus;
	}
	
	public void updateProfile() {
		// method update profile
	}
	
	public void updateAvailibility() {
		// Update availibility
	}

}
