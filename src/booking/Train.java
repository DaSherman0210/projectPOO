/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author CENTIC
 */
public class Train extends TransportService{
    private String seatType;
    private int wagonNumber;
    
    public Train(){
        
    }
    public Train(int id,String origin,String destination,double price,String seatType,int wagonNumber){
        this.setId(id);
        this.setOrigin(origin);
        this.setDestination(destination);
        this.setPrice(price);
        this.setSeatType(seatType);
        this.setWagonNumber(wagonNumber);
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public void setWagonNumber(int wagonNumber) {
        this.wagonNumber = wagonNumber;
    }

    public String getSeatType() {
        return seatType;
    }

    public int getWagonNumber() {
        return wagonNumber;
    }
    
    

    @Override
    public String getServiceInformation() {
        String str= "Seat Type: "+ this.getSeatType()+"\nWagon Number: "+this.getWagonNumber();
        return str;
    }

    @Override
    public String getLuggageInformation() {
        String str="Luggage: ";
        return str;
    }
    
    
}
