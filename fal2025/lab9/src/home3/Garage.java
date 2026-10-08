package home3;

public class Garage {
    public Bike[] bikes;
    public Car[] cars;
    public int Bcount;
    public int Ccount;

    public Garage(int ccap, int bcap){
        bikes = new Bike[bcap];
        cars = new Car[ccap];
        System.out.println("Welcome to the Garage!");
        System.out.println("Car Capacity: " + ccap);
        System.out.println("Bike Capacity: " + bcap);
    }

    public void addVehicle(Vehicle temp){
        if( temp instanceof Car){
            Car c = (Car) temp;
            if(Ccount<cars.length){
                cars[Ccount++] = c;
                System.out.println("A " + c.getBrand() + " CAR has been added to the Garage");
            }
            else {
                System.out.println("Can't add more Cars! Capacity: " + cars.length);
            }
        }
        else if (temp instanceof  Bike) {
            Bike b = (Bike) temp;
            if(Bcount<bikes.length){
                bikes[Bcount++] = b;
                System.out.println("A " + b.getBrand() + " CAR has been added to the Garage");
            }
            else {
                System.out.println("Can't add more Bikes! Capacity: " + bikes.length);
            }
        }
    }
}
