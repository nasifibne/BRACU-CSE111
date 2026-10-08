package ungraded2;

public class BracuBus {

    public String route;
    public int cap;
    public int count;
    public BracuStudent[] board;

    public BracuBus(String route){
        this.route =route;
        this.cap= 2;
        board = new BracuStudent[cap];
    }

    public BracuBus(String route, int cap){
        this.route = route;
        this.cap = cap;
        board = new BracuStudent[cap];
    }

    public void showDetails(){
        System.out.println("bus route " + this.route );
        System.out.println("passenger count : " +this.count + " (max: "+ this.cap + ")");
        System.out.println("Passengers on Board: ");
        if(count>1){
            for (int i = 0; i < count; i++) {
                System.out.println(board[i].name + " ");
            }
        }
    }

    public void board(){
        System.out.println("no passenger");
    }
    public void board(BracuStudent st){
        if(st.getLoc().equals(route)){
            if(count<cap){
                if(st.pass){
                    board[count++] = st;
                    System.out.println(st.name + " boarded the bus.");
                }
                else {
                    System.out.println("You don't have a bus pass!");
                }
            }
            else {
                System.out.println("Bus is full!");
            }
        }
        else {
            System.out.println("You got on the wrong bus!");
        }
    }
    public void board(BracuStudent st1 , BracuStudent st2){
        board(st1);
        board(st2);
    }
}
