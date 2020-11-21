package Flight;

public class RegularTicket {
    private static int PNRNumber=101;
    private String departureLocation;
    private String destinationLocation;
    private float ticketPrize;
    private boolean isTicketConfirmed;
    private Flight flight;
    private Passenger  passenger;

    private boolean food;
    private boolean water;
    private boolean snacks;
    private static int seatNumber=0;

    public RegularTicket(String departureLocation, String destinationLocation, float prizeOfTicket,
                         boolean food, boolean water, boolean snacks,
                         Flight flight, Passenger  passenger){
        this.PNRNumber=PNRNumber++;
        this.departureLocation=departureLocation;
        this.destinationLocation=destinationLocation;
        this.ticketPrize=prizeOfTicket;
        this.water=water;
        this.food=food;
        this.snacks=snacks;
        this.flight=flight;
        this.passenger=passenger;
        this.seatNumber=seatNumber;


    }

    public String bookTicket(){
         this.seatNumber=++this.seatNumber;
         if(this.seatNumber>this.flight.getCapacity()){
             isTicketConfirmed=false;

             return "Can't book Seat.";
         }
         else{
             isTicketConfirmed=true;
             this.flight.setNumOfSeatsBooked();
             System.out.println(this.passenger.getContactDetails());
            System.out.println(this.passenger.getAddressDetails());
             System.out.println(this.flight.getFlightDetails());
             System.out.println(this.ticketDetails());
             return "Ticket Booked";
         }
    }

    public String ticketDetails(){
        return "Ticket type: Regular Ticket"+ ", Seat Number: "+this.seatNumber+ ", Status of Ticket:" +this.StatusOfTicket(this.isTicketConfirmed);
    }

    public String StatusOfTicket(boolean isTicketConfirmed){
        if (isTicketConfirmed)
            return "Confirmed";
        else
            return "Cancelled";
    }
    /*public String durationOfJourney(){

    }*/

    public void cancelTicket(){
        isTicketConfirmed=false;

    }

    public String availedServices(){
        return "Availed Services are" + (food ?"Food":"" )+(water ?", Water":"")+ (snacks ?", Snacks":"") ;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public int getPNRNumber() {
        return PNRNumber;
    }

    public void updateServices(boolean _food, boolean _water, boolean _snacks){
        food=_food;
        water=_water;
        snacks=_snacks;

    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public boolean isTicketConfirmed() {
        return isTicketConfirmed;
    }

    public float getTicketPrize() {
        return ticketPrize;
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
