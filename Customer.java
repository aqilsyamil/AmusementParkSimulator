package task1;

public class Customer extends User{
	private String customerID;
	private int registrationCard;
	
	public Customer() {
		super();
		this.customerID = "";
		this.registrationCard = 0;

	}

	public Customer(String fullName, String email, String password, Park park, String customerID, int registrationCard) {
		super(fullName, email, password, park);
		this.customerID = customerID;
		this.registrationCard = registrationCard;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public int getRegistrationCard() {
		return registrationCard;
	}

	public void setRegistrationCard(int registrationCard) {
		this.registrationCard = registrationCard;
	}
	
	public void updateProfile() {
		// Update profile method
	}
	
	public void transactionHistory() {
		// Transaction history method
	}
}
