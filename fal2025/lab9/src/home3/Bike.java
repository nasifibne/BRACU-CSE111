package home3;

public class Bike extends Vehicle{

    public String model;
    public int doors;
    public boolean Sidecar;

    public Bike(String brand , String model , int year , int wheel , boolean sidecar){
        super(brand,year);
        super.setWheels(wheel);
        this.model = model;
        this.Sidecar =sidecar;
    }
    public String toString(){
        return "Bike " + super.toString() + ",Model: " + this.model+", Doors: "+ this.doors+", SideCar: "+ this.Sidecar;
    }
    public void doAWheelie(){
        if(!this.Sidecar){
            System.out.println(this.getBrand() + ":" + this.model + " is doing Wheelie!!");
        }
        else {
            System.out.println("Wheelie Failed. " + this.getBrand() + ":" + this.model + " has SideCar");
        }
    }

}
