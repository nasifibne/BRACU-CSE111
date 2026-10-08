package home4;

public class ElectricCar extends Vehicle{

    public static int total;
    public int capacity;
    public String type;
    public static ElectricCar[] evcars = new ElectricCar[5];
    public static int count;

    public ElectricCar(String model , int pri , int cap){
        super(model, pri);
        this.capacity = cap;
        this.type = "Electric Vehicle";
        evcars[count++] = this;
        System.out.println("Vehicle ID: EV000 created");
    }
    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type: " + this.type);
        System.out.println("Battery Capacity: "+ this.capacity + " KWh");
    }
    public static void markAsSoldEV(ElectricCar temp){
        temp.sold = true;
    }


}
