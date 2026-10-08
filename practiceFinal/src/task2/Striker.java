package task2;

public class Striker extends Football {

    public int goals;
    public int shots;


    public Striker (String name , int age , int stamina , int goals, int shots){
        super(name, age, stamina);
        this.goals= goals;
        this.shots= shots;
    }
    public void display(){
        super.display();
        System.out.println("Goals: "+this.goals);
        System.out.println("Shots on targer : " + this.shots);
    }
    public void calculatePerformance(){
        System.out.println("performance: " + ((double)goals/shots));
    }

}
