package task4;

public class Dragon extends MagicalCreature{
    public int power;

    public Dragon(String name , int age , int power){
        super(name, age);
        this.power = power;
    }
    public void makeSound(){
        System.out.println(this.name + " roars with a fiery breath!");
    }
    public void performMagic() {
        System.out.println(this.name + " breathes fire with power level: " + this.power);
    }
    public void fly(){
        System.out.println(this.name + " flies through the sky.");
    }

}
