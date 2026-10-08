package ungraded3;

public class Warrior extends Character{
    public Warrior(String name , int level){
        super(name, level);
    }
    public void specialMove(){
        System.out.println(super.name + " performs a heavy sword slash!");
    }
}
