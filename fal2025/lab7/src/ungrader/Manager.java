package ungrader;

public class Manager extends SportsPerson {

    public int match_win;

    public Manager(String  team , String name, String role , int win){
        super(team, name, role);
        this.match_win = win;
        this.earningPerMatch = match_win * 1000;
    }

    public void printDetails(){
        System.out.println(super.getNameTeam());
        System.out.println("Team Role: " + this.role);
        System.out.println("Total Win: "+ this.match_win);
        System.out.println("Match Earning: "+ (int)this.earningPerMatch+ "K");
    }

}
