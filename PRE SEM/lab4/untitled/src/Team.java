public class Team {
        public String name;
        public Player[] play = new Player[10];
        public int count=0;

        public Team(){

        }
        public Team(String a){
            name=a;
        }
        public void updateName(String a ){
            name= a;
        }
        public void addPlayer(Player t){
            play[count++]= t;
        }
        public void printDetail(){
            System.out.println("Team: " + name);
            System.out.println("List of players: ");
            for(int i = 0 ; i<count ;i++){
                play[i].print();
            }
        }
}
