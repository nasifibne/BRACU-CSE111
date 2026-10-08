package home1;

public class Cow extends Animal {
    public String name;

    public Cow(){
        super();
        System.out.println("The cow says hello!");
    }

    public String getName(){
        return this.name;
    }

    public void updateSound(String sound){
        this.sound =sound;
    }

    public String  getSound(){
        return this.sound;
    }

}
