public class Parcel {
    public String name;
    public double fee;
    public String loc;
    public int weight;

    public Parcel(){
        name="";
        fee=0.0;
        weight =0;

    }
    public Parcel(String n){
        this();
        this.name=n;
    }
    public Parcel(String n, int a){
        this();
        this.name=n;
        this.weight =a;
    }
    public void calcFee(String a ){
        int localcha=0;
        if(a.equals("Dhanmondi")){
            localcha =50;
        }
        fee= (weight * 20) + localcha;
    }
    public void addWeight(int a){
        weight+=a;
        System.out.println("Updated Weight: "+weight);
    }
    public void printDetails(){
        if(name.length()==0){
            System.out.println("Set name first");
        }
        else {
            System.out.println("Name: "+name);
            System.out.println("Total Weight: "+weight);
            System.out.println("Total Fee: " + fee);
        }
    }

}
