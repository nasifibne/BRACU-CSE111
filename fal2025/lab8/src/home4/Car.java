package home4;

public class Car extends Vehicle {

    public static int total;
    public int seat;
    public String type;
    public static Car[] cars = new Car[5];
    public static int count;

    public Car(String name , int pri , int seat){
        super(name,pri);
        this.seat = seat;
        this.type = "Regular Car";
        total++;
        super.vehicleId = "CAR00" + total;
        cars[count++]= this;
        System.out.println("Vehicle ID: "+this.vehicleId+" created");
    }

    public void vehicleDetail(){
        super.vehicleDetail();
        System.out.println("Type: " + this.type);
        System.out.println("Seats: "+ this.seat);
    }

    public static void showAllAvailableCars(){
        System.out.println("total Car: " +total);
        System.out.println("Available Cars");
        for (int i = 0; i < count; i++) {
           if(cars[i].sold == false) {
               System.out.println(cars[i].vehicleId + " : " + cars[i].model);
           }
        }
    }
    public static void markAsSold(Car temp){
          temp.sold = true;
    }
    public static void showAllCars(){
        System.out.println("total Car: " +total);
        for (int i = 0; i < count; i++) {
            if(cars[i].sold){
                System.out.println( cars[i].vehicleId +" : "+ cars[i].model + " - sold");
            }
            else {
                System.out.println( cars[i].vehicleId +" : "+ cars[i].model + " - available");
            }
        }
    }




}
