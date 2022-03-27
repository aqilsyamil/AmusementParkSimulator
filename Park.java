package task1;

public class Park {
	private String parkName;
	private String branchNo;
	private Address address;
	
	public Park() {
	}

	public Park(String parkName, String branchNo, Address address) {
		this.parkName = parkName;
		this.branchNo = branchNo;
		this.address = address;
	}

	public String getParkName() {
		return parkName;
	}

	public void setParkName(String parkName) {
		this.parkName = parkName;
	}

	public String getBranchNo() {
		return branchNo;
	}

	public void setBranchNo(String branchNo) {
		this.branchNo = branchNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void updatePark() {
		//Method to update park details
	}
}
