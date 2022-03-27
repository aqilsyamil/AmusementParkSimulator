package task1;

public class Admin extends Staff {
	private String adminRank;

	public Admin() {
		super();
		this.adminRank = "";
	}

	public Admin(String fullName, String email, String password, Park park, String staffID, String staffStatus, String adminRank) {
		super(fullName, email, password, park, staffID, staffStatus);
		this.adminRank = adminRank;
	}

	public String getAdminRank() {
		return adminRank;
	}

	public void setAdminRank(String adminRank) {
		this.adminRank = adminRank;
	}
	
	public void updateTicketInfo() {
		// Method to update ticket info
	}

	
}
