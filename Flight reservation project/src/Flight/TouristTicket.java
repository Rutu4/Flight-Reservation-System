package Flight;

public class TouristTicket extends Ticket{

    private String touristHotelAddress;
    private String[] touristLocations= new String[4];



    public TouristTicket( String departureLocation, String destinationLocation,String dateAndTimeOfDestination,String dateAndTimeOfDeparture,
                         float ticketPrize, String touristHotelAddress,String touristLocations[],
                         Flight flight, Passenger passenger){
        super(destinationLocation,departureLocation,dateAndTimeOfDeparture, dateAndTimeOfDestination,ticketPrize,flight,passenger);



        this.touristHotelAddress=touristHotelAddress;
        this.touristLocations=touristLocations;




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
            return "PNR Number: "+ PNRNumber;
        }
    }

    public String cancelTicket(){
        isTicketConfirmed=false;
        this.flight.seatsBooked--;
        return "Cancelled";
    }


    public String ticketDetails(){
        return "Ticket type: Tourist Ticket"+ ", Seat Number: "+this.seatNumber;
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


    public String getTouristHotelAddress() {
        return touristHotelAddress;
    }



    public String getTouristLocations() {
        String locations="";
        for(int i=0;i<5;i++){
            locations=locations+ touristLocations[i];
        }
        return locations;
    }

}
