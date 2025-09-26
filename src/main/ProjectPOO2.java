
package main;
import customers.*;
import booking.*;

public class ProjectPOO2 {

    public static void main(String[] args) {
        
        try{
            
            // PASSENGERS
            
            Passenger ps1 = new Passenger("Oscar", 23, "A567S123");
            Passenger ps2 = new Passenger("Joseph", 18, "FHJG53221V");
            
            ps1.addTransportService(12, "Sao Paulo", "Giron", 23000000);
            ps2.addTransportService(13, "Cambagdu", "La guajira", 123300000);
            
            System.out.println("-------------PASSENGERS-------------");
            System.out.println(ps1);
            System.out.println(ps2);
            System.out.println("-------------------------------------");
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
}
