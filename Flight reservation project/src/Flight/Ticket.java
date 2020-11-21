
package Flight;

public abstract class Ticket {
    private    int PNRNumber=101;
    private String  departureLocation;
    private String  destinationLocation;
    private float ticketPrize;
    public boolean isTicketConfirmed;
    public Flight flight;
    public Passenger  passenger;
    public  int seatNumber=0;

    public Ticket( String destinationLocation, String departureLocation, float ticketPrize, Flight flight, Passenger passenger){
        this.PNRNumber=PNRNumber++;
        this.seatNumber=++seatNumber
        this.departureLocation=departureLocation;
        this.destinationLocation=destinationLocation;
        this.ticketPrize=ticketPrize;
        this.flight=flight;
        this.passenger=passenger;
        this.isTicketConfirmed=isTicketConfirmed();
    }


    public  abstract bookTicket(){

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
