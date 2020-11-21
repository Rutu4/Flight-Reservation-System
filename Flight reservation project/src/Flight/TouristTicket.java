package Flight;

public class TouristTicket {
    private static int PNRNumber=201;
    private String departureLocation;
    private String destinationLocation;
    private Flight flight;
    private  Passenger passenger;
    private float ticketPrize;
    private boolean isTicketConfirmed;

    private String touristHotelAddress;
    private String[] touristLocations= new String[4];
    private static int seatNumber=1;


    public TouristTicket( String departureLocation, String destinationLocation,
                         float prizeOfTicket, String touristHotelAddress,String touristLocations[],
                         Flight flight, Passenger passenger){
        this.PNRNumber=PNRNumber++;
        this.departureLocation=departureLocation;
        this.destinationLocation=destinationLocation;
        this.ticketPrize=prizeOfTicket;
        this.touristHotelAddress=touristHotelAddress;
        this.touristLocations=touristLocations;
        this.flight=flight;
        this.passenger=passenger;

        this.seatNumber=seatNumber;

    }

    public String bookTicket(){
        this.seatNumber=this.seatNumber++;
        if(this.seatNumber>this.flight.getCapacity()){
            isTicketConfirmed=false;
            return "Can't book Seat.";
        }
        else{
            isTicketConfirmed=true;
            this.flight.setNumOfSeatsBooked();
            this.passenger.getAddressDetails();
            this.passenger.getContactDetails();
            this.flight.getFlightDetails();
            this.ticketDetails();
            return "Ticket Booked";
        }
    }

    public String ticketDetails(){
        return "Ticket type: Regular Ticket"+ ", Seat Number: "+this.seatNumber+
                ", Status of Ticket:" +this.isTicketConfirmed();
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

    public void addTouristLocation(String location){
        for(int i=0;i<5;i++){
            if(touristLocations[i]==null){
                touristLocations[i]=location;

                break;
            }
            else{
                System.out.print("Cant add location");
            }
        }
    }

    public void removeLocation(String location){
        for(int i=0;i<5;i++){
            if(touristLocations[i].equals(location)){
                touristLocations[i]=null;
                break;
            }
        }
    }

    public int getPNRNumber() {
        return PNRNumber;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public float getTicketPrize() {
        return ticketPrize;
    }

    public boolean isTicketConfirmed() {
        return isTicketConfirmed;
    }

    public String getTouristHotelAddress() {
        return touristHotelAddress;
    }



    public String[] getTouristLocations() {
        return touristLocations;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

}
