package lab4;

public class Tennis_Tournament extends Tournament {
    public int players;

    public Tennis_Tournament(String name, int players){
        super(name);
        this.players = players;
    }

    public String info(){
        return "Tenis " + super.getName()+ "\nNumber of  player: " + this.players;
    }
}
