package Question8;

public class ParkingTicketSimulatorDemo {

	public static void main(String[] args) {
		
		 System.out.println("Set minutes purhcased to 60 and parked for 120 minutes");
        
		 ParkedCar car = new ParkedCar("AUDI", 2012, "Black", "34A43GHO", 124 );
		 
		 ParkingMeter meter = new ParkingMeter(60);
		 
		 PoliceOfficer officer = new PoliceOfficer("Emre", 2324);
		 
		 ParkingTicket ticket  = officer.search(car, meter);
		 
		 if(ticket != null)
			 System.out.println(ticket);
		 else
			 System.out.println("No crimes committed.");
		 
	}

}
