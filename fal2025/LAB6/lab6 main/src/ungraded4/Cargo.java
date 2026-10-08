package ungraded4;

public class Cargo {
    public static double cap= 10.0;
    public static int total;

    public String cont;
    public double weight;
    public int id;
    public boolean load = false;

    public Cargo(String cont , double weight){
        this.cont =cont;
        this.weight = weight;
        this.id = ++total;
    }

    public static double capacity(){
        return cap;
    }

    public void details(){
        System.out.println("cargo id " + this.id );
        System.out.println("contenct " + this.cont);
        System.out.println("weight " + this.weight);
        System.out.println("loaded " + this.load);
    }
    public void load(){
        if(this.weight<cap){
            load = true;
            cap -= this.weight;
            System.out.println("cargo " + this.id + " is loaded for transport");
        }
        else {
            System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }
    public void unload(){
        this.load =false;
        cap += this.weight;
        System.out.println("Cargo " + this.id + " unloaded.");
    }



}
