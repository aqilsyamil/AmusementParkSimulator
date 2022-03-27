package task1;

import java.util.Scanner;
public class AmusementParkSimulator {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println("WELCOME TO AMUSEMENT PARK SIMULATOR");
		System.out.println("-----------------------------------");
		System.out.println("");
		
		Park lottePark = new Park("Lotte World Park", "LP123",
				new Address("Olympic-ro","Songpa-gu", 16499, "South Korea"));
		Park everlandPark = new Park("Everland Park", "EP345",
				new Address("Everland-ro","Pogog-eup", 44768, "South Korea"));
		
		System.out.print(" 1 - LOTTE WORLD PARK, SEOUL \n 2 - EVERLAND PARK, GYEONGGI \n 3 - QUIT SIMULATOR\n");
		int parkSelected = sc.nextInt();
		
		Park selectedPark = new Park();
		
		if (parkSelected == 1) {
			selectedPark = lottePark;
		}
		
		else if (parkSelected == 2) {
			selectedPark = everlandPark;
		}
		
		else if (parkSelected == 3) {
			System.exit(0);
		}
		
		
		//public TicketInfo(double ticketPrice, int ticketQty, Ride ride)
		Ride rollerCoaster = new Ride("Roller Coaster", "Available", 1.55, selectedPark);
		TicketInfo RC[] = new TicketInfo[3];
		RC[0] = new TicketInfo("ADULT",5000, rollerCoaster);
		RC[1] = new TicketInfo("CHILDREN",3000, rollerCoaster);
		RC[2] = new TicketInfo("SENIOR",0, rollerCoaster);
		
		Ride merryGoRound = new Ride("Merry Go Round", "Available", 1.20, selectedPark);
		TicketInfo MGR[] = new TicketInfo[3];
		MGR[0] = new TicketInfo("ADULT",3000, merryGoRound);
		MGR[1] = new TicketInfo("CHILDREN",1500, merryGoRound);
		MGR[2] = new TicketInfo("SENIOR",0, merryGoRound);
		
		Ride bungeeJump = new Ride("Bungee Jump", "Available", 1.60, selectedPark);
		TicketInfo BJ[] = new TicketInfo[3];
		BJ[0] = new TicketInfo("ADULT",20000, bungeeJump);
		BJ[1] = new TicketInfo("CHILDREN",12000, bungeeJump);
		BJ[2] = new TicketInfo("SENIOR",0, bungeeJump);
		
		
		boolean simulatorRun = true;
		
		Customer[] customers = new Customer[100];
		int customerCount = 0;
		Admin[] admins = new Admin[100];
		int adminCount = 0;
		Operator[] operators = new Operator[100];
		int operatorCount = 0;
				
		while(simulatorRun) {

		String accountFound = "";
		
		Customer accountCustomer = new Customer();
		Admin accountAdmin = new Admin();
		Operator accountOperator = new Operator();
		
		
		boolean signUp = true;
		
		while(signUp) {
			System.out.print(" 1 - REGISTER \n 2 - LOG IN \n 3 - QUIT SIMULATOR\n");
			int account = sc.nextInt();
			
			if (account == 1) {
				System.out.print(" 1 - CUSTOMER \n 2 - STAFF \n 3 - QUIT SIMULATOR\n");
				int userType = sc.nextInt();
				
				if (userType == 1) {
					System.out.print("FULL NAME: ");
					String fullName = sc.next();
					System.out.print("\nEMAIL: ");
					String email = sc.next();
					System.out.print("\nPASSWORD: ");
					String password = sc.next();
					System.out.print("\nCUSTOMER ID: ");
					String customerID = sc.next();
					System.out.print("\nREGISTRATION CARD: ");
					int registrationCard = sc.nextInt();
					
					Customer customer = new Customer(fullName, email, password, selectedPark, customerID, registrationCard);
					customers[customerCount] = customer;
					customerCount++;
				}
				
				else if (userType == 2) {
					System.out.print(" 1 - ADMIN \n 2 - OPERATOR \n 3 - QUIT SIMULATOR\n");
					int staffType = sc.nextInt();
					
					if (staffType == 1) {
						System.out.print("FULL NAME: ");
						String fullName = sc.next();
						System.out.print("\nEMAIL: ");
						String email = sc.next();
						System.out.print("\nPASSWORD: ");
						String password = sc.next();
						System.out.print("\nSTAFF ID: ");
						String staffID = sc.next();
						System.out.print("\nADMIN RANK: ");
						String adminRank= sc.next();
						
						Admin admin = new Admin(fullName, email, password, selectedPark, staffID, "Available", adminRank);
						admins[adminCount] = admin;
						adminCount++;
					}
					
					else if (staffType == 2) {
						System.out.print("FULL NAME: ");
						String fullName = sc.next();
						System.out.print("\nEMAIL: ");
						String email = sc.next();
						System.out.print("\nPASSWORD: ");
						String password = sc.next();
						System.out.println("\nSTAFF ID: ");
						String staffID = sc.next();
						System.out.print("SELECT RIDE:\n 1 - ROLLER COASTER \n 2 - MERRY GO ROUND \n 3 - BUNGEE JUMP\n");
						int rideSelected = sc.nextInt();
						
						Ride selectedRide = new Ride();
						
						if (rideSelected == 1) {
							selectedRide = rollerCoaster;
						}
						
						else if (rideSelected == 2) {
							selectedRide = merryGoRound;
						}
						
						else if (rideSelected == 3) {
							selectedRide = bungeeJump;
						}
						
						Operator operator = new Operator(fullName, email, password, selectedPark, staffID, "Available", selectedRide);
						operators[operatorCount] = operator;
						operatorCount++;
					}
					
					else if (staffType == 3) {
						//EXIT SYSTEM
						System.exit(0);
						
					}
					
				}
				
				else if (userType == 3) {
					//EXIT SYSTEM
					System.exit(0);
					
				}
				
			}
			
			else if (account == 2) {
				System.out.print("FULL NAME: ");
				String fullName = sc.next();
				System.out.print("EMAIL: ");
				String email = sc.next();
				System.out.print("PASSWORD: ");
				String password = sc.next();
				
				boolean accountStatus = false;
				for(int i = 0; i < 100; i++) {
				
						
						if (admins[i] != null && admins[i].getFullName().equals(fullName) && admins[i].getEmail().equals(email) 
								&& admins[i].getPassword().equals(password)) {
							accountStatus = true;
							accountFound = "ADMIN";
							accountAdmin = admins[i];
						}
						
						else if (operators[i] != null && operators[i].getFullName().equals(fullName) && operators[i].getEmail().equals(email)
								&& operators[i].getPassword().equals(password)) {
							accountStatus = true;
							accountFound = "OPERATOR";
							accountOperator = operators[i];
							
						}
						
						else if(customers[i] != null && customers[i].getFullName().equals(fullName) && customers[i].getEmail().equals(email)
								&& customers[i].getPassword().equals(password)) {
							accountStatus = true;
							accountFound = "CUSTOMER";
							accountCustomer = customers[i];
					}
						
				
			}
			
				if (accountStatus == false) {
					System.out.println(" ACCOUNT DOES NOT EXIST !");
				}
				else {
					signUp = false;
				}
			
		}
			
			else if (account == 3){
				//EXIT SYSTEM
				System.exit(0);
				
			}

		}
	
		
		if (accountFound.equals("ADMIN")) {
			// Admin boleh tukar ticketInfo (price/tarikh/masa)
		}
		
		else if (accountFound.equals("OPERATOR")) {
			// Operator boleh tukar ride status
		}
		
		else if (accountFound.equals("CUSTOMER")) {
			// Customer boleh order ticket
			System.out.println(" 1 - ROLLER COASTER\n 2 - MERRY GO ROUND\n 3 - BUNGEE JUMP");
			System.out.println(" CHOOSE RIDE: ");
			int chooseRide = sc.nextInt();
			TicketInfo placeHolder = new TicketInfo();
			
			if(chooseRide == 1) {
				System.out.println(" CHOOSE A TICKET: ");
				for(int x = 0; x < 3; x++) {
				System.out.println(RC[x].toString());
				}
				System.out.print(" 0 - ADULT\n 1 - CHILDREN\n 2 - SENIOR ");
				System.out.println(" CHOOSE TYPE: ");
				int chooseType = sc.nextInt();
				placeHolder = RC[chooseType];
				
			}
		
			else if(chooseRide == 2) {
				System.out.println(" CHOOSE A TICKET: ");
				for(int y = 0; y < 3; y++) {
				System.out.println(MGR[y].toString());
				}
				System.out.print(" 0 - ADULT\n 1 - CHILDREN\n 2 - SENIOR ");
				System.out.println(" CHOOSE TYPE: ");
				int chooseType = sc.nextInt();
				placeHolder = MGR[chooseType];
				
			}
			
			else if(chooseRide == 3) {
				System.out.println(" CHOOSE A TICKET: ");
				for(int z = 0; z < 3; z++) {
				System.out.println(BJ[z].toString());
				}
				System.out.print(" 0 - ADULT\n 1 - CHILDREN\n 2 - SENIOR ");
				System.out.println(" CHOOSE TYPE: ");
				int chooseType = sc.nextInt();
				placeHolder = BJ[chooseType];
				
			}
			
			Ticket ticket = new Ticket(" AVAILABLE", "9:00 AM TO 10:00 PM", accountCustomer, placeHolder);
			//public Ticket(String ticketStatus, String time, Customer customer,
			System.out.println(ticket.toString());
			System.out.print(" YOU HAVE PURCHASED THE TICKET, SEE YOU THERE !\n\n");
			
			}
		}

	}

}
