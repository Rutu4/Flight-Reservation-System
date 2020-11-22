package Flight;

public class Flight {
    private int flightNumber;
    private String airlineOfFlight;
    private int capacity;
    public int seatsBooked=0;




    public Flight( int flightNumber,String airlineOfFlight, int capacity){
        this.flightNumber=flightNumber;
        this.airlineOfFlight=airlineOfFlight;
        this.capacity=capacity;
        this.seatsBooked=seatsBooked;
    }


    public Flight (Flight flight){
        this.flightNumber=flight.flightNumber;
        this.airlineOfFlight=flight.airlineOfFlight;
        this.capacity=flight.capacity;
        this.seatsBooked=flight.seatsBooked;
    }

    public String getFlightDetails(){
        return "Flight number: "+ flightNumber +", Airline of flight: "+airlineOfFlight+
                ", Capacity: " +capacity;

    }
    public boolean checkAvailabilityOfSeats(){
        if(seatsBooked<capacity)
            return true;
        else
            return false;
    }
    public void updateSeatsBooked(){

    }
    public int getFlightNumber(){
        return flightNumber;
    }
    public String getAirlineOfFlight(){
        return airlineOfFlight;
    }
    public int getCapacity(){
        return capacity;
    }
   public int getSeatsBooked(){
        return seatsBooked;
   }

}
