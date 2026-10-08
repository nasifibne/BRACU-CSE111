package home2;

public class VIPConcert extends Concert {

    public VIPConcert(String  venue , String  time){
        super(venue, time);
    }

    public void buyTicket(){
        ticket++;
        ticketCount++;
        price = 2000;
        System.out.println("total price " + this.price);
    }
}
