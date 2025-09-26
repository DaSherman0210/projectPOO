package booking;

public class Flight extends TransportService{
    private String airline;
    private String seatClass;
    
    public Flight(){
        
    }
    
    public Flight(int id, String origin, String destination, double price, String airline, String seatClass){
        this.setAirline(airline);
        this.setSeatClass(seatClass);
    }
    
    public final void setAirline(String airline) {
        this.airline = airline;
    }

    public final void setSeatClass(String seatClass) {
        this.seatClass = seatClass;
    }

    public String getAirline() {
        return airline; //holaaa pepito
    }

    public String getSeatClass() {
        return seatClass;
    }
    
    
    @Override
    public String getServiceInformation() {
        return this.airline;
    }
    
    
    @Override
    public String getLuggageInformation() {
        return this.seatClass;
    }

    @Override
    public String toString() {
        return "Flight" + "\nairline=" + airline + ", \nseatClass=" + seatClass;
    }
    
    
}
