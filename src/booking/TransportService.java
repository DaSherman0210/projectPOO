
package booking;

public class TransportService {
    private int id;
    private String origin;
    private String destination;
    private double price;
    
    public TransportService(){
    }
    
    public TransportService(int id,String origin,String destination,double price){
        this.setId(id);
        this.setDestination(destination);
        this.setOrigin(origin);
        this.setPrice(price);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TransportService{" + "id=" + id + ", origin=" + origin + ", destination=" + destination + ", price=" + price + '}';
    }
    
}
