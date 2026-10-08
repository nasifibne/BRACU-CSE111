package lab4;



public class Cricket_Tournament extends Tournament {

    public int teams;
    public String type = "No type";

    public Cricket_Tournament(){
        super();
    }
    public Cricket_Tournament(String name , int teams, String type){
        super(name);
        this.teams = teams;
        this.type = type;
    }
    public String info(){
        return "Cricket " + super.getName()+ "\nNumber of  Teams: " + this.teams+ "\nType: "+ this.type;
    }
}
