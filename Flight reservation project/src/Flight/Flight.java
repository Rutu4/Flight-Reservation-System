package Flight;

public class Flight {

    //attributes of Flight class
    private int flightNumber;
    private String airlineOfFlight;
    private int capacity;
    public int seatsBooked=0;



    // constructor of Flight class
    public Flight( int flightNumber,String airlineOfFlight, int capacity){
        this.flightNumber=flightNumber;
        this.airlineOfFlight=airlineOfFlight;
        this.capacity=capacity;
        this.seatsBooked=seatsBooked;
    }

    //constructor to shallow copy the object of Flight class
    public Flight (Flight flight){
        this.flightNumber=flight.flightNumber;
        this.airlineOfFlight=flight.airlineOfFlight;
        this.capacity=flight.capacity;
        this.seatsBooked=flight.seatsBooked;
    }

    //method for flight details
    public String getFlightDetails(){
        return "Flight number: "+ flightNumber +", Airline of flight: "+airlineOfFlight+
                ", Capacity: " +capacity;

    }

    //method to check availability of seat
    public boolean checkAvailabilityOfSeats(){
        if(seatsBooked<capacity)
            return true;
        else
            return false;
    }

    //method to update seats booked
    public void updateSeatsBooked(){
            this.seatsBooked=seatsBooked;
    }

    //getter's for flight number, airline , capacity and seats booked
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
