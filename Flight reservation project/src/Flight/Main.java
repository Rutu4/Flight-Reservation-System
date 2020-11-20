package Flight;

public class Main {
    public static  void main(String[] args){





        RegularTicket regTicket= new RegularTicket("200","Cst","Aasam",2000,
                true, false, false);

        System.out.println(regTicket.PNRNumber);
        System.out.println(regTicket.departureLocation);
        System.out.println(regTicket.destinationLocation);
        System.out.println(regTicket.isTicketConfirmed);

        System.out.println(regTicket.availedServices());


        TouristTicket tourTicket= new TouristTicket("234","ABC","XYZ",8000,"manali");




        Flight flight=new Flight(20,"Indigo",100,"11/09/2020", "12/09/2020",
                "10:50","5:10");

        System.out.println(flight.flightNumber);
        System.out.println(flight.airlineOfFlight);
        System.out.println(flight.capacity);
        System.out.println(flight.dateOfDeparture);
        System.out.println(flight.dateOfDestination);
        System.out.println(flight.timeOfDeparture);
        System.out.println(flight.timeOfDestination);

        System.out.println(flight.checkAvailabilityOfSeats());
        System.out.println(flight.getFlightDetails());

        Flight flight1=new Flight(flight);

        System.out.println(flight1.flightNumber);
        System.out.println(flight1.airlineOfFlight);
        System.out.println(flight1.capacity);
        System.out.println(flight1.dateOfDeparture);
        System.out.println(flight1.dateOfDestination);
        System.out.println(flight1.timeOfDeparture);
        System.out.println(flight1.timeOfDestination);

        System.out.println(flight.checkAvailabilityOfSeats());
        System.out.println(flight.getFlightDetails());


        Address address1= new Address("hollycross","mumbai","Maharashtra");

        System.out.println(address1.addressStreet);
        System.out.println(address1.addressCity);
        System.out.println(address1.addressState);

        System.out.println(address1.getAddressDetails());

        Contact contact1= new Contact("Raja","raja@gmail.com","876543");
        System.out.println(contact1.contactName);
        System.out.println(contact1.contactPhoneNumber);
        System.out.println(contact1.contactEmailId);

        System.out.println(contact1.getContactDetails());


    }

}
