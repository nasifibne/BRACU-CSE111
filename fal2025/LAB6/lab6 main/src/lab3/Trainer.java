package lab3;

public class Trainer {
    public String name;
    public Pokemon[] get = new Pokemon[7];
    public int count;
    public static int trainer;
    public int id;
    public double avg;

    public Trainer(String name){
        this.name = name;
        id = ++ trainer;
        System.out.println("trainer id: T"+id+ " Name: "+ this.name + "- created");
    }
    public void catchPokemon(Pokemon poke){
        if(count<7){
            get[count++] = poke;
            System.out.println(this.name + " caught: " + poke.getName());
        }
        else {

        }
    }
    public void viewPokeDex(){
        System.out.println(this.name + "'s Trainer code: t"+this.id);
        for (int i = 0 ; i<count ; i++){
            System.out.println(get[i].getName() + " : " + get[i].getHP() + " points");
        }
        System.out.println("Average of HP: " + avarage());


    }
    public double avarage(){
        double sum=0;
        for (int i =0 ; i<count ; i++){
           sum += get[i].getHP();
        }
        avg = sum/count;
        return avg;
    }
    public static void battle (Trainer t1 , Trainer t2){
        System.out.println("battle Info");
        System.out.println(t1.name + "'s HP average: "+ t1.avarage());
        System.out.println(t2.name + "'s HP average: " +t2.avarage());
        if (t1.avarage()>t2.avarage()){
            System.out.println(t1.name + " wins");
        }
        else if (t1.avarage()==t2.avarage()){
            System.out.println("battle draw");
        }
        else {
            System.out.println(t2.name + " wins");
        }
    }
}
