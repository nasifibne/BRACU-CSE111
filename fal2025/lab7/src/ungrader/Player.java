package ungrader;

public class Player extends SportsPerson {

    public int total_goal;
    public int total_match;
    public double ratio;

    public Player(String team, String name , String role, int goal, int play){
        super(team,name,role);
        this.total_goal = goal;
        this.total_match = play;
        this.earningPerMatch = (total_goal * 1000) + (total_match * 10);
    }
    public void calculateRatio(){
        ratio = ((double) this.total_goal/this.total_match);
    }
    public void printDetails(){
        System.out.println(super.getNameTeam());
        System.out.println("Team Role: "+ this.role);
        System.out.println("Total Goal: " + this.total_goal+ ", Total Played: "+ this.total_match);
        System.out.printf("Goal Ratio: %.2f\n" , this.ratio);
        System.out.println("Match Earning: " + (int) this.earningPerMatch + "K");
    }
}
