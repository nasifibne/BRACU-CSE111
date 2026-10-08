package home2;

public class Character {

    public static int kid;
    public static int teen;
    public static int adult;
    public static int total;
    public static String strong = "None";
    public static int stronghel;
    public static int sum;
    public int health;
    public int id;
    public String name;
    public String group;


    public Character(String name , String grp , int health){
        id = ++total;
        this.name = name;
        this.group= grp;
        if(grp.equals("Kid")){
            kid++;
        }
        else if(grp.equals("Teen")){
            teen++;
        }
        else if(grp.equals("Adult")){
            adult++;
        }
        this.health = health;
        sum += health;
        if (stronghel<health){
            strong = name + " (Health " + health + ")";
            stronghel = health;
        }
    }

    public Character(String name , int health){
        id = ++total;
        this.name = name;
        this.group= "Teen";
        teen++;
        this.health = health;
        sum += health;
        if (stronghel<health){
            strong = name + " (Health " + health + ")";
            stronghel = health;
        }
    }

    public void printDetails(){
        System.out.println("ID: " + id + ", Name: " + name);
        System.out.println("Group: " + group);
        System.out.println("Health: " + health );
    }

    private static double avg(){
        if(sum==0){
            return 0;
        }
        else {
            return (double) sum / total;
        }
    }

    public static void printStats(){
        System.out.println("Total characters: " + total);
        System.out.println("Kids: " + kid);
        System.out.println("Teens: " + teen);
        System.out.println("Adults: " + adult);
        System.out.println("Average Health: " + avg());
        System.out.println("Strongest Character: " + strong);
    }
}
