
package main;
import customers.*;
import booking.*;

public class ProjectPOO2 {

    public static void main(String[] args) {
        
        try{
            
            // PASSENGERS
            
            Passenger ps1 = new Passenger("Oscar", 23, "A567S123");
            Passenger ps2 = new Passenger("Joseph", 18, "FHJG53221V");
            Passenger ps3=new Passenger("Luis",25,"A92K3OE20");
            
            TransportService fligth1 = new Flight();
            TransportService bus1 = new Bus();
            TransportService cruiser1=new Cruiser();
            
            ps1.addTransportService(bus1);
            ps1.addTransportService(fligth1);
            ps2.addTransportService(cruiser1);
            ps3.addTransportService(bus1);
            
            //ps1.addTransportService(12, "Sao Paulo", "Giron", 23000000);
            //ps2.addTransportService(13, "Cambagdu", "La guajira", 123300000);
            
            System.out.println("-------------PASSENGERS-------------");
            System.out.println(ps1);
            System.out.println(ps2);
            System.out.println(ps3);
            System.out.println("-------------------------------------");
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}
