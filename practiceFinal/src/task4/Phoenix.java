package task4;

public class Phoenix extends MagicalCreature {
    public int rebirth;

    public Phoenix(String name , int age , int rebirth){
        super(name, age);
        this.rebirth = rebirth;
    }
    public void makeSound(){
        System.out.println(this.name + " sings an enchanting song");
    }
    public void performMagic() {
        System.out.println(this.name + " is reborn with " + this.rebirth + " rebirth cycles.");
    }
    public void regenerate(){
        System.out.println(this.name + " regenerates its body in a burst of flames.");
    }

}
