package lab5;

public class Cat extends Animal {
    public String breed;

    public Cat(String name, int age, String color, String breed){
        super(name,age,color);
        this.breed = breed;
    }

    public String catInfo(){
        return super.info() +"Breed: "+ this.breed;
    }

    public void makeSound(){
        System.out.println(this.color + " color "+ this.name+ " is meowing");
    }
}
