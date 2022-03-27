package task1;

public class Address {
	 private String street;
	 private String city;
	 private int postalCode;
	 private String country;
	 
	 public Address() {
	}
	
	 public Address(String street, String city, int postalCode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
		this.country = country;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void updateAddress() {
		//Method to update address of the park
	}
	 
}
