package home5;

public class Organizer {
    public String name;
    public Event[] org = new Event[4];
    public int count;

    public Organizer(){
        System.out.println("Please provide the organizer's name");
    }

    public Organizer(String name){
        this.name= name;
    }

    public void organizeEvent(Event ev){
       if (count<4) {
           org[count++] = ev;
           System.out.println(this.name + " successfully organized " + ev.getName());
       }
    }

    public void searchEventByDate(String date){
        boolean flag = false;
        for (int i = 0; i < count; i++) {
            if(org[i].date.equals(date)){
                flag= true;
                System.out.println(org[i].getName());
            }
        }
        if(!flag){
            System.out.println("No event is scheduled for "+ date);
        }
    }
}
