
package customers;
import booking.TransportService;

public class Passenger extends Person{
    
    private String passportNumber;
    private TransportService transportService;
    
    public Passenger(){
        this.passportNumber = "";
        this.transportService = new TransportService();
    }
    
    public Passenger(String name, int age, String passportNumber){
        super(name, age);
        this.setPassportNumber(passportNumber);
        this.transportService = new TransportService();
    }
    
    public void addTransportService(int id, String origin, String destination, double price){
        this.transportService = new TransportService(id,origin,destination,price);
    }
    
    // SETTERS
    
    public final void setPassportNumber(String passportNumber){
        this.passportNumber = passportNumber;
    }
    
    // GETTERS
    
    public String getPasspportNumber(){
        return this.passportNumber;
    }
    
    @Override
    
    public String toString(){
        String res = super.toString();
        res += "\n Passport number: " + this.getPasspportNumber();
        return (res);
    }
    
    
}
