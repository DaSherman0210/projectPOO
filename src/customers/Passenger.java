
package customers;
import booking.TransportService;

public class Passenger extends Person{
    
    private String passportNumber;
    private TransportService transportService;
    
    public Passenger(){
        this.passportNumber = "";
        this.transportService = null;
    }
    
    public Passenger(String name, int age, String passportNumber){
        super(name, age);
        this.setPassportNumber(passportNumber);
        this.transportService = null;
    }
    
    public void addTransportService(TransportService transportService){
        this.transportService = transportService;
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
        res += this.transportService;
        return (res);
    }
    
    
}
