package Flight;

public class RegularTicket extends Ticket {

    private boolean food;
    private boolean water;
    private boolean snacks;


    public RegularTicket(int PNRNumber,String departureLocation, String destinationLocation, float prizeOfTicket,
                         boolean food, boolean water, boolean snacks,
                         Flight flight, Passenger  passenger){
        super(PNRNumber,destinationLocation,departureLocation,prizeOfTicket,flight,passenger);
        this.water=water;
        this.food=food;
        this.snacks=snacks;



    }



    public String availedServices(){
        return "Availed Services are" + (food ?"Food":"" )+(water ?", Water":"")+ (snacks ?", Snacks":"") ;
    }



    public void updateServices(boolean _food, boolean _water, boolean _snacks){
        food=_food;
        water=_water;
        snacks=_snacks;

    }



    public boolean isSnacks() {
        return snacks;
    }

    public boolean isWater() {
        return water;
    }

    public boolean isFood() {
        return food;
    }
    public void setFood(boolean food){
        this.food=food;
    }
    public void setWater(boolean water){
        this.water=water;
    }
    public  void setSnacks(boolean snacks){
        this.snacks=snacks;
    }
}
