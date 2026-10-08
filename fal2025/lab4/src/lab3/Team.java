package lab3;

public class Team {
    public String name;
    public Player[] player;
    public int count;

    public Team(){
        player = new Player[11];
    }
    public Team(String name){
        this.name = name;
        player = new Player[11];
    }

    public void updateName(String name){
        this.name = name;
    }
    public void addPlayer(Player play){
        player[count++] = play;
    }
    public void printDetail(){
        System.out.printf("Team: %s\nList of players: \n",this.name);
        for (int i =0 ; i<count ; i++){
            System.out.printf("Name: %s\nAge: %d, Total Matches: %d\n",player[i].name ,player[i].age,player[i].matches  );
        }
    }

}
