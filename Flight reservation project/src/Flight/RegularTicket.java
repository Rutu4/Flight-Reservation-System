package Flight;

// Creating RegularTicket class Which extends Ticket cLass
public class RegularTicket extends Ticket {

    //attribites of RegularTicket class
    private boolean food;
    private boolean water;
    private boolean snacks;

    // constructor of RegularTicket
    public RegularTicket(String departureLocation, String destinationLocation,String dateAndTimeOfDeparture,
                         String dateAndTimeOfDestination, float ticketPrize,
                         boolean food, boolean water, boolean snacks,
                         Flight flight, Passenger  passenger){
        super(destinationLocation,departureLocation, dateAndTimeOfDeparture, dateAndTimeOfDestination ,ticketPrize,flight,passenger);
        this.water=water;
        this.food=food;
        this.snacks=snacks;




    }

    // method statusOfTicket to book ticket and return PNR NUmber
    public String statusOfTicket(){
        if(this.flight.getSeatNumber()>this.flight.getCapacity()){
            this.isTicketConfirmed=false;

            return "Can't book Seat.";
        }
        else{
            this.isTicketConfirmed=true;
            this.flight.updateSeatsBooked();
            System.out.println(this.passenger.getContactDetails());
            System.out.println(this.passenger.getAddressDetails());
            System.out.println(this.flight.getFlightDetails());
            System.out.println(this.ticketDetails());
            return "PNR Number: "+PNRNumber;
        }
    }

    //method to cancel Ticket
    public String cancelTicket(){
        isTicketConfirmed=false;
        this.flight.setSeatNumber((this.flight.getSeatNumber())-1);
        return "Cancelled";
    }

    // method to return ticket details
    public String ticketDetails(){
        return "Ticket type: Regular Ticket"+ ", Seat Number: "+this.flight.getSeatNumber()+ ", Status of Ticket:" +(isTicketConfirmed?"Confirmed":"Cancelled");
    }





    //method to return availed sevices by passenger
    public String availedServices(){
        return "Availed Services are" + (food ?"Food":"" )+(water ?", Water":"")+ (snacks ?", Snacks":"") ;
    }


    // nethod to update availed services by passenger
    public void updateServices(boolean _food, boolean _water, boolean _snacks){
        food=_food;
        water=_water;
        snacks=_snacks;

    }


    // getter and setters for availed services
    public boolean isSnacks() {
        return snacks;
    }

    public boolean isWater() {
        return water;
    }

    public boolean isFood() {
        return food;
    }
    public void setFood(boolean food){
        this.food=food;
    }
    public void setWater(boolean water){
        this.water=water;
    }
    public  void setSnacks(boolean snacks){
        this.snacks=snacks;
    }
}
