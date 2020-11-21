package Flight;

public class Main {
    public static void main(String[] args) {

        Passenger passenger= new Passenger("Hollycross", "Mumbai","Maharastra",
                "Abhinav", "9876543","Abhinav@gmail.com");

        Flight flight=new Flight(1432,"Indigo", 50,"11/9/2020",
                "12/9/2020","10.50","4:10");
        RegularTicket ticket= new RegularTicket("Mumbai","Manali",
                2000,true,true,false, flight, passenger);

        System.out.print(ticket.bookTicket());

}}
