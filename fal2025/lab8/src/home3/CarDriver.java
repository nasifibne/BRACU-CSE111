package home3;

public class CarDriver extends GenericDriver{

    public String name;
    public String status= "Premium";
    public static String[] restrictedAreas= new String[2];
    public static int count;

    public CarDriver(String  name) {
        super(name);
        this.name = name;
    }

    public String toString(){
        return this.name+ "'s driver profile is " + this.status;
    }

    public void hasSafetyTraining(){
        super.hasSafetyTraining();
        if(status.equals("Premium")){
            System.out.println("Premium drivers receive extra safety briefings.");
        }
    }

    public static void restrictedAreas(String area){
        restrictedAreas[count++] = area;
    }

    public void fightRestriction(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < count ; j++) {
                if(arr[i].equals(restrictedAreas[j])){
                    System.out.println(this.name + " cannot enter " + restrictedAreas[j]);
                    flag = true;
                }
            }
            if(!flag) {
                System.out.println(this.name + " can enter " + arr[i]);
            }
        }
    }

    public String acceptRide(boolean hasvalue){
        String temp = super.acceptRide(hasvalue) + "\n" +  this.toString();
        return temp;
    }
}
