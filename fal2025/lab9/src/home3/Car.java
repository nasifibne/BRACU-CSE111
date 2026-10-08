package home3;

public class Car extends Vehicle{

    public String model;
    public int doors;
    public boolean ai;

    public Car(String brand , String model , int year , int door , int wheel , boolean ai){
        super(brand,year);
        super.setWheels(wheel);
        this.model = model;
        this.doors = door;
        this.ai=ai;
    }
    public String toString(){
        return "Car " + super.toString() + ",Model: " + this.model+", Doors: "+ this.doors+", AI: "+ this.ai;
    }
    public void startAutoPilot(){
        if(this.ai){
            System.out.println(this.getBrand() + " " + this.model + " AutoPilot Started");
        }
        else {
            System.out.println(this.getBrand() + " " + this.model + " has NO AutoPilot");
        }
    }
}
