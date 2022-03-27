package task1;

public class TicketInfo {
	private String ticketType;
	private double ticketPrice;
	private Ride ride;
	
	public TicketInfo() {
	}

	public TicketInfo(String ticketType, double ticketPrice, Ride ride) {
		this.ticketPrice = ticketPrice;
		this.ride = ride;
		this.ticketType = ticketType;
	}
	
	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	
	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public Ride getRide() {
		return ride;
	}

	public void setRide(Ride ride) {
		this.ride = ride;
	}

	@Override
	public String toString() {
		return " Ticket Type" + getTicketType() + " Ticket Price" + getTicketPrice()
				+ " Ride:" + getRide().getRideStatus();
	}
	
	
	
	
	
	

}
