package booking;

public class Cruiser extends TransportService{
    private int amountPassengers;
    private String suiteClass;
    
    public Cruiser(){
        
    }
    
    public Cruiser(int id, String origin, String destination, double price, String suiteClass,int amountPassengers){
        this.setAmountPassengers(amountPassengers);
        this.setSuiteClass(suiteClass);
    }

    public int getAmountPassengers() {
        return amountPassengers;
    }

    public void setAmountPassengers(int amountPassengers) {
        this.amountPassengers = amountPassengers;
    }

    public String getSuiteClass() {
        return suiteClass;
    }

    public void setSuiteClass(String suiteClass) {
        this.suiteClass = suiteClass;
    }
    
  
    
    @Override
    public String getServiceInformation() {
        String s="Cruiser super cool";
        return s;
    }
    
    
    @Override
    public String getLuggageInformation() {
        String s="Please do not exceed the weight of luggage (10kg)";
        return s;
    }

    @Override
    public String toString() {
        return "Cruiser" + "\nTotal passengers=" + amountPassengers + "\nseatClass=" + suiteClass;
    }
    
    
}
