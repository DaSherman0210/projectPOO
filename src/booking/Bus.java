/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package booking;

/**
 *
 * @author CENTIC
 */
public class Bus extends TransportService{
    private String busCompany;
    private String boardingPoint;

    public Bus(){
        
    }
    public Bus(int id,String origin,String destination,double price,String busCompany,String boardingPoint){
        this.setId(id);
        this.setOrigin(origin);
        this.setDestination(destination);
        this.setPrice(price);
        this.setBusCompany(busCompany);
        this.setBoardingPoint(boardingPoint);
    }
    
    
    public String getBusCompany() {
        return busCompany;
    }

    public String getBoardingPoint() {
        return boardingPoint;
    }

    public final void setBusCompany(String busCompany) {
        this.busCompany = busCompany;
    }

    public final void setBoardingPoint(String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }
    
    
}
