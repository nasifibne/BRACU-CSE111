package q21;

public class TravelApp {
    public String name;
    public int cap;
    public int total;
    public TravelApp com[];

    public TravelApp( String name , int cap){
        this.name= name;
        this.cap = cap;
        com = new TravelApp[cap];

    }
    public TravelApp(String name){
        this.name= name;
        this.cap = 5;
        com = new TravelApp[cap];
    }
    public void showInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Capacity: " + this.cap);
        System.out.println("total companion: " + this.total);
        System.out.println("Companion list");
        for (int i = 0 ; i<total ; i++){
            System.out.println(com[i].name + " ");
        }
    }
    public void addCompanion (TravelApp temp){
        if((total<cap) && (this != temp) && (temp.total<temp.cap)){
            com[total++] = temp;
            temp.com[temp.total++] = this;
            System.out.println(temp.name + " is added to your Companion list " + this.name);
            if(total == cap){
                System.out.println("Your companion list is full "+ this.name);
            }
        }
        else if(temp.total>=temp.cap) {
            System.out.println("Can't add "+ temp.name + ". Companion list of " + temp.name+ " is full");
        }
        else if(total<cap) {
            System.out.println("Can't add "+ this.name + ". Companion list of " + this.name+ " is full");
        }
    }
}
