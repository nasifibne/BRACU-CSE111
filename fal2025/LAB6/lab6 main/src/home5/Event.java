package home5;

public class Event {
    public static Event[] eve = new Event[5];
    private String name;
    public String date;
    public static int totalevent;

    public Event(String name , String  date){
        eve[totalevent++] = this;
        this.name= name;
        this.date= date;
    }

    public void setName(){
    }

    public String getName(){
        return name;
    }

    public static void allEventInfo(){
        System.out.println("Total Events: "+ totalevent);
        System.out.println("Event Details: ");
        for (int i = 0; i < totalevent; i++) {
            System.out.println("Event " + (i+1)+":");
            System.out.println("Name: "+ eve[i].name);
            System.out.println("Date: "+ eve[i].date);

        }
    }

    public String details(){
       return "Name: "+ this.name+"\nDate: "+ this.date;
    }
}
