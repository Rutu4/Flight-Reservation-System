package Flight;

public class TouristTicket extends Ticket{

    private String touristHotelAddress;
    private String[] touristLocations= new String[4];



    public TouristTicket( String departureLocation, String destinationLocation,
                         float prizeOfTicket, String touristHotelAddress,String touristLocations[],
                         Flight flight, Passenger passenger){
        super(destinationLocation,departureLocation,prizeOfTicket,flight,passenger);


        this.touristHotelAddress=touristHotelAddress;
        this.touristLocations=touristLocations;




    }






    /*public String durationOfJourney(){

    }*/


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



    public String[] getTouristLocations() {
        return touristLocations;
    }

}
