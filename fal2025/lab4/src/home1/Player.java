package home1;

public class Player {
    public String player;
    public String[] defeat= new String[5];
    public int hp;
    public int count;

    public Player(String player , int hp){
        this.player = player;
        this.hp=hp;
        System.out.printf("%s joined the game\n",player);
        System.out.printf("HP: %d\n",hp);
    }
    public Player(String player){
        this.player = player;
        this.hp=100;
        System.out.printf("%s joined the game\n",player);
        System.out.printf("HP: %d\n",hp);
    }
    public void viewInfo(){
        System.out.printf("Player Name: %s\n", this.player);
        System.out.printf("Current HP: %d\n", this.hp);
        if(count>0) {
            System.out.printf("Defeated:\n");
            for (int i = 0; i < count; i++) {
                System.out.printf(this.defeat[i] + ", ");
            }
            System.out.println();
        }
    }
    public void defeatVillain(String player, int hp){
        if(count<5) {
            if (hp > this.hp) {
                System.out.printf("failed to defeat %s\n", player);
            } else {
                System.out.printf("defeated %s\n", player);
                this.hp += hp;
                this.defeat[count++] = player;
            }
        }
        else{
            System.out.printf("maximum villains are defeated\n");
        }
    }
    public void defeatVillain(Player player){
        defeatVillain(player.player , player.hp);
    }
    public void defeatVillain(char x , String player , int hp){
        int y = (int)x - (int)'0';
        this.hp = this.hp * y;
        System.out.printf("HP with %cx boost: %d\n", x , this.hp);
        defeatVillain(player, hp);
    }
}
