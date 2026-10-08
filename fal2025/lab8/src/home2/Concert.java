package home2;

public class Concert  {

    public String venue;
    public String time;
    public String zone;
    public String[] artist = new String[5];
    public int count;
    public int ticketCount;
    public int price;
    public static int ticket;

    public Concert(String venue, String time){
        this.venue =venue;
        this.time = time;
    }

    public void showDetails(){
        System.out.println("Venue: " +this.venue);
        System.out.println("Showtime: " + this.time);
        System.out.println("Artist:");
        for (int i = 0; i < count; i++) {
            System.out.println(artist[i]);
        }
        System.out.println("Tickets sold in this concert: "+ ticketCount);
    }

    public void addArtist(String name){
        if(count<5){
            this.artist[count++] = "-" + name;
        }
    }

    public void buyTicket(String zone , int qua){
        ticket+=qua;
        ticketCount+=qua;
        //this.zone = zone;
        if(zone.equals("A")){
            price = 500*qua;
        }
        else{
            price =1000*qua;
        }
        System.out.println("total price " + this.price);
    }

    public void buyTicket(String zone){
        buyTicket(zone,1);
    }

    public static void showTotalTicketsSold(){
        System.out.println("Total tickets sold (all venues): " + ticket);
    }
}
