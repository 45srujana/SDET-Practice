package oops.concept.question2;

public class Car extends Vehicle{
    private String numberOfDoors;

    public Car(String brand, String model, int year, String numberOfDoors){
        this.numberOfDoors=numberOfDoors;
    }
    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void startEngine() {
    System.out.println("Engine starting...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine Stopped...");
    }
    public String displayInfo(){

        return super.displayInfo()+ "\nNo. of doors : "+numberOfDoors;
    }
}
