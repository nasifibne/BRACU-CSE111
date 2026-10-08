package home3;

public class BikeDriver extends  GenericDriver{

    public String name;
    public String status= "Premium";
    public static String[] restrictedAreas= new String[3];
    public static int count;

    public BikeDriver(String name, String status){
        super(name);
        this.name= name;
        this.status = status;
    }
    public String toString(){
        return this.name+ "'s driver profile is " + this.status;
    }
    public static void restrictedAreas(String area){
        restrictedAreas[count++] = area;
    }

    public String acceptRide(boolean hasvalue){
        //String temp = super.acceptRide(hasvalue) + "\n" +  this.toString();
        return super.acceptRide(hasvalue) + "\n" +  this.toString();
    }

    public void fightRestriction(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < count ; j++) {
                if(arr[i].equals(restrictedAreas[j])){ // defense area   de
                    System.out.println(this.name + " cannot enter " + restrictedAreas[j]);
                    flag = true;
                }
            }
            if(!flag) {
                System.out.println(this.name + " can enter " + arr[i]);
            }
        }
    }
}
