package Flight;

public class Flight {
    private static int idCounter;
    private int flightNumber;
    private String airlineOfFlight;
    private int capacity;
    private int numOfSeatsBooked;
    private String dateOfDeparture;
    private String dateOfDestination;
    private String timeOfDeparture;
    private String timeOfDestination;

    static{
        idCounter=0;
    }


    public Flight( int flightNumber,String airlineOfFlight, int capacity, String dateOfDeparture,
                  String dateOfDestination,String timeOfDeparture, String timeOfDestination){
        this.flightNumber=flightNumber;
        this.airlineOfFlight=airlineOfFlight;
        this.capacity=capacity;
        this.dateOfDeparture=dateOfDeparture;
        this.dateOfDestination=dateOfDestination;
        this.timeOfDeparture=timeOfDeparture;
        this.timeOfDestination=timeOfDestination;
    }
     public Flight (){
                  this(0,"",0,"00/00/0000",
                          "00/00/00/0000","00:00","00:00");
     }

    public Flight (Flight flight){
        this.flightNumber=flight.flightNumber;
        this.airlineOfFlight=flight.airlineOfFlight;
        this.capacity=flight.capacity;
        this.numOfSeatsBooked=flight.numOfSeatsBooked;
    }

    public String getFlightDetails(){
        return "Flight number: "+ flightNumber +", Airline of flight: "+airlineOfFlight+
                ", Capacity: " +capacity+", Number of Seats Booked: 1";

    }
    public boolean checkAvailabilityOfSeats(){
        if(numOfSeatsBooked<capacity)
            return true;
        else
            return false;
    }
    public void updateNumOfSeatsBooked(){

    }
    public int getFlightNumber(){
        return flightNumber;
    }
    public String getAirlineOfFlight(){
        return airlineOfFlight;
    }
    public String getDateOfDeparture(){
        return dateOfDeparture;
    }
    public String getDateOfDestination(){
        return dateOfDestination;
    }
    public String getTimeOfDeparture(){
        return  timeOfDeparture;
    }
    public String getTimeOfDestination(){
        return timeOfDestination;
    }
    public int getCapacity(){
        return capacity;
    }
   public int getNumOfSeatsBooked(){
        return numOfSeatsBooked;
   }
   public void setNumOfSeatsBooked(){

   }
}
