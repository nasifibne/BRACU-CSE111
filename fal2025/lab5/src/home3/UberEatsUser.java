package home3;

public class UberEatsUser {
    public String name;
    public String loc= "unknown";

    public UberEatsUser(String name, String loc){
        this.name = name;
        this.loc = loc;
    }

    public UberEatsUser(String  name){
        this.name= name;
    }

    public void updateLocation(String loc){
        if( this.loc.equals("unknown")){
            this.loc = loc;
            System.out.printf("Update Successful!\n");
        }
        else {
            System.out.println("We already have your location. Please place an order!");
        }
    }

}
