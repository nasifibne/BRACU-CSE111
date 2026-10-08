package task2;

public class Defender extends Football {
    public int tackle;
    public int interceptions;


    public Defender (String name , int age , int stamina , int tackle, int interceptions){
        super(name, age, stamina);
        this.tackle= tackle;
        this.interceptions= interceptions;
    }
    public void display(){
        super.display();
        System.out.println("Goals: "+this.tackle);
        System.out.println("Shots on targer : " + this.interceptions);
    }
    public void calculatePerformance(){
        System.out.println("performance: " + ((double)interceptions/tackle));
    }

}
