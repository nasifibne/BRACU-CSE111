package SlackTester;

public class SlackChannel {
    public String name;
    public int total;
    public String[] faculty = new String[5];
    public String[] member = new String[5];
    public int fac;
    public int mem;

    public SlackChannel(String name){
        this.name = name;
        System.out.println("A new channel has been created");
    }
    public void addMember(String ini , String type ){
        if(total<5 ){
            faculty[fac++] = ini;
            total++;
            System.out.println(type + " " + ini + " has been added to slack");
        }
        else {
            System.out.println("Maximum capacity exceed");
        }
    }
    public void addMember(String ini ){
        if(total<5 ){
            member[mem++] = ini;
            total++;
            System.out.println("Student " + ini + " has been added to slack");
        }
        else {
            System.out.println("Maximum capacity exceed");
        }
    }
    public void info(){
        System.out.println("Channel Name: "+ name);
        System.out.println("Total Member: " + total);
        System.out.println("Students");
        for (int i =0 ; i<mem ; i++){
            System.out.println(member[i]);
        }
        System.out.println("other members");
        for (int i =0 ; i<fac ; i++){
            System.out.println(faculty[i]);
        }

    }
}
