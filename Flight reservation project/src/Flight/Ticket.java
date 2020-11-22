
package Flight;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public abstract class Ticket {
    public static int idCounterForPNR;
    public    int PNRNumber=101;
    private String  departureLocation;
    private String  destinationLocation;
    private float ticketPrize;
    public boolean isTicketConfirmed=false;
    public Flight flight;
    public Passenger  passenger;
    public  int seatNumber=0;
    private String dateAndTimeOfDeparture;
    private String getDateAndTimeOfDestination;
    private long duration;
    static{
        idCounterForPNR=1232;

    }


    public Ticket( String destinationLocation, String departureLocation,String dateAndTimeOfDeparture,
                   String getDateAndTimeOfDestination, float ticketPrize, Flight flight, Passenger passenger){
        this.PNRNumber=++idCounterForPNR;
        this.departureLocation=departureLocation;
        this.destinationLocation=destinationLocation;
        this.ticketPrize=ticketPrize;
        this.flight=flight;
        this.passenger=passenger;
        this.dateAndTimeOfDeparture=dateAndTimeOfDeparture;
        this.getDateAndTimeOfDestination=getDateAndTimeOfDestination;

    }




    abstract String ticketDetails();

    abstract String statusOfTicket();

    public long durationOfJourney(){
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
       try {
           Date d1 = sdf.parse(dateAndTimeOfDeparture);
           Date d2 = sdf.parse(getDateAndTimeOfDestination);
           duration = d2.getTime() - d1.getTime();
       }
       catch (ParseException e){
           System.out.println("cant find Duration");
       }
       return duration;
    }

   abstract  String cancelTicket();




    public int getPNRNumber() {
        return PNRNumber;
    }

    public boolean isTicketConfirmed() {
        return isTicketConfirmed;
    }

    public float getTicketPrize() {
        return ticketPrize;
    }

    public String getDepartureLocation(){
        return departureLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }
    public String getDateAndTimeOfDeparture(){
        return dateAndTimeOfDeparture;
    }
    public String getGetDateAndTimeOfDestination(){
        return getDateAndTimeOfDestination;
    }
}
