package Flight;

public class RegularTicket extends Ticket {

    private boolean food;
    private boolean water;
    private boolean snacks;


    public RegularTicket(String departureLocation, String destinationLocation,String dateAndTimeOfDeparture,
                         String dateAndTimeOfDestination, float ticketPrize,
                         boolean food, boolean water, boolean snacks,
                         Flight flight, Passenger  passenger){
        super(destinationLocation,departureLocation, dateAndTimeOfDeparture, dateAndTimeOfDestination ,ticketPrize,flight,passenger);
        this.water=water;
        this.food=food;
        this.snacks=snacks;




    }
    public String statusOfTicket(){
            this.seatNumber=++(this.seatNumber);
        if(this.seatNumber>this.flight.getCapacity()){
            this.isTicketConfirmed=false;

            return "Can't book Seat.";
        }
        else{
            this.isTicketConfirmed=true;
            this.flight.seatsBooked++;
            System.out.println(this.passenger.getContactDetails());
            System.out.println(this.passenger.getAddressDetails());
            System.out.println(this.flight.getFlightDetails());
            System.out.println(this.ticketDetails());
            return "PNR Number: "+PNRNumber;
        }
    }

    public String cancelTicket(){
        isTicketConfirmed=false;
        this.flight.seatsBooked--;
        return "Cancelled";
    }

    public String ticketDetails(){
        return "Ticket type: Regular Ticket"+ ", Seat Number: "+this.seatNumber+ ", Status of Ticket:" +(isTicketConfirmed?"Confirmed":"Cancelled");
    }






    public String availedServices(){
        return "Availed Services are" + (food ?"Food":"" )+(water ?", Water":"")+ (snacks ?", Snacks":"") ;
    }



    public void updateServices(boolean _food, boolean _water, boolean _snacks){
        food=_food;
        water=_water;
        snacks=_snacks;

    }



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
