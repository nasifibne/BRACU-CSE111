package home2;

class UpsideDown extends Hawkins{

    public static int totalBridges;
    private Hawkins brd1;
    private Hawkins brd2;

    public UpsideDown(String name){
        super(name);
    }

    public void connect( Hawkins h){
        if (brd1 == null) {
            brd1 = h;
            totalBridges++;
        }
        else if (brd2 == null) {
            brd2 = h;
            totalBridges++;
        }
        else {
            System.out.println("No further bridges with " + this.name);
        }
    }

    public Hawkins getBridge1() {
        return brd1;
    }

    public Hawkins getBridge2() {
        return brd2;
    }

    public void disconnect(int num){
        if(num>2){
            System.out.println("Invalid bridge number!");
        }
        else {
            if (num == 1 && brd1 != null) {
                brd1 = null;
                totalBridges--;
            } else if (num == 2 && brd2 != null) {
                brd2 = null;
                totalBridges--;
            } else {
                System.out.println("No further bridges with " + this.name + "\nInvalid bridge number!");
            }
        }
    }

    public void activate(Hawkins obj ){
        System.out.println("Activating the door of " + obj.name);
    }

    public void details(){
        System.out.println(super.name + "  Details:");
        if (brd1 != null) {
            System.out.println("Bridge 1: " + brd1.name);
        }
        if (brd2 != null) {
            System.out.println("Bridge 2: " + brd2.name);
        }
    }
}
