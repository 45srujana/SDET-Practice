package oops.concept.question2;

public abstract class Vehicle {
    //private attributes for brand, model, and year (d
    private String brand;
    private String model;
    private int year;
    private int speed;

//Dynamically setter and getters...
public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public int getSpeed() {return speed;}


    //Abstract methods...

    public abstract void startEngine();
    public abstract void stopEngine();

    //printing the info...
    public String displayInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Brand: ").append(brand)
                .append("\nModel: ").append(model)
                .append("\nYear: ").append(year)
                .append("\nSpeed: ").append(speed);
        return sb.toString();
    }
    @Override
    public String toString() {
        return displayInfo();
    }
}
