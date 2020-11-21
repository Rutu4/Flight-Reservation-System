package Flight;

public abstract class Ticket {
    private    int PNRNumber=101;
    private String  departureLocation;
    private String  destinationLocation;
    private float ticketPrize;
    public boolean isTicketConfirmed;
    public Flight flight;
    public Passenger  passenger;
    private  int seatNumber=0;

    public Ticket(int PNRNumber, String destinationLocation, String departureLocation, float ticketPrize, Flight flight, Passenger passenger){
        this.PNRNumber=PNRNumber++;
        this.departureLocation=departureLocation;
        this.destinationLocation=destinationLocation;
        this.ticketPrize=ticketPrize;
        this.flight=flight;
        this.passenger=passenger;
        this.isTicketConfirmed=isTicketConfirmed();
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



    public String getDepartureLocation() {
        return departureLocation;
    }

    public int getPNRNumber() {
        return PNRNumber;
    }

    public boolean isTicketConfirmed() {
        return isTicketConfirmed;
    }

    public float getTicketPrize() {
        return ticketPrize;
    }



}
