package lab2;

public class UsedBattery extends Waste{

    boolean used ;
    public UsedBattery(String id , boolean flag){
        super(id);
        used = flag;
    }

}
