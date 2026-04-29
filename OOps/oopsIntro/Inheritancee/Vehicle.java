package Inheritancee;


public class Vehicle {

    public String name ;
    public String model;
    public int  noOfTyres;

    Vehicle(String name, String model, int noOfTyres){
        this.name  = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }


    void startEngine(){
        System.out.println("Engine started");
    }
    void stopEngine(){
        System.err.println("Engine Stopped");
    }
}



