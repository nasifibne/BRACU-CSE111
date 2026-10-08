package ungraded3;

public class Paladin extends Warrior{

    public Paladin(String name , int level){
        super(name, level);
    }
    public void specialMove(){
        System.out.println(super.name + " unleashes a holy strike!");
    }


}
