package Inheritancee;

public class Car extends Vehicle {
    
    public int noofDoors;
    public String transmitionType ;

    Car(String name, String model, int noOfTyres, int noofDoors, String transmitionType){
        super(name, model, noOfTyres);
        this.noofDoors = noofDoors;
        this.transmitionType = transmitionType;
    }

    public void startAC() {
        System.out.println("AC started");
    }
}
