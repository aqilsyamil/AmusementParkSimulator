package task1;

public class Ticket {
	private String ticketStatus;
	private String time;
	private Customer customer;
	private TicketInfo ticketInfo;
	
	public Ticket() {
	}

	public Ticket(String ticketStatus, String time, Customer customer,
			TicketInfo ticketInfo) {

		this.ticketStatus = ticketStatus;
		this.time = time;
		this.customer = customer;
		this.ticketInfo = ticketInfo;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public TicketInfo getTicketInfo() {
		return ticketInfo;
	}

	public void setTicketInfo(TicketInfo ticketInfo) {
		this.ticketInfo = ticketInfo;
	}
	
	public void placeOrder() {
		// Pilih Ride, Date, Time, Ticket ID
	//	System.out.println("CHOOSE A RIDE: ");
	}

	@Override
	public String toString() {
		return "Ticket Status: " + getTicketStatus() + " Working Hours: " + getTime() + " Ticket Info: " + getTicketInfo().toString() ;
	}

	
	
}
