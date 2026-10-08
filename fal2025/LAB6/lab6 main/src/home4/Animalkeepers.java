package home4;

public class Animalkeepers {
    public static String[] Animals=new String[]{"Lion" , "Tiger" , "Seal" , "Gorilla", "Deer"};
    public static String[] doTask = new String[Animals.length];
    public static int count;
    public static int idCount= 100;
    private int id;
    public String name;

    public Animalkeepers(String name){
        this.name= name;
        id = ++idCount;
        System.out.println(this.name+ " with ID "+ getId()+ " got the job!");
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void doTask(String ani , String job){
        boolean flag = false;
        for (int i = 0; i < Animals.length; i++) {
            if(Animals[i].equals(ani)){
                flag = true;
                if(doTask[i]== null){
                    count++;
                }
                doTask[i] = job + "(Keeper - " + this.name+ ") === "+ ani;
                System.out.println("Task assigned to "+ this.name);
            }
        }
        if(!flag){
            System.out.println("Animal not in the Safari");
        }
    }

    public static void printTasks(){
        if(count>0){
            for (int i = 0; i < Animals.length; i++) {
                if(!(doTask[i]==null)){
                    System.out.println(doTask[i]);
                }
            }
        }
        else {
            System.out.println("No tasks assigned.");
        }
    }

    public static void details(){
        if(count>0) {
            System.out.println("Total Animal Keeper: " + (idCount % 100));
            System.out.println("Total Task assigned: " + count);
            printTasks();
        }
        else {
            System.out.println("No Animal Keepers working yet.");
        }
    }
}
