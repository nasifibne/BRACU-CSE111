package lab1;

public class Pokemon {
    public String name ;

    public Pokemon(String name){
        this.name = name;
    }
    public void attack(){
        System.out.println(this.name + "  attacks with a basic move!");
    }
    public void attack(String move){
        System.out.println(this.name + " uses " + move );
    }
    public void attack(String move, int power){
        System.out.println(this.name + " uses " + move  +" with power " + power);
    }
}
