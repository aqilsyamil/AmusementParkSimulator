package task1;

public abstract class User {
	private String fullName;
	private String email;
	private String password;
	private Park park;

	public User() {
		this.fullName = "";
		this.email = "";
		this.password = "";
		this.park = new Park();
	}
	
	public User(String fullName, String email, String password, Park park) {
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.park = park;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Park getPark() {
		return park;
	}

	public void setPark(Park park) {
		this.park = park;
	}

	
	public abstract void updateProfile();
		
	
}
