public class MoneyTracker {
    public String name;
    public double bal;
    public int in;
    public int ex;

    public String info(){
        String a ="Name: " + name ;
        String b = "Current Balance: " + bal;
        return a+"\n" + b;
    }
    public void createTracker(String n ){
        name = n ;
        bal = 1.0;

    }
    public void income(int x){
        bal +=x;
        in = x;
        System.out.println("Balance Updated.");
    }
    public void expense(int x){
        if(x==bal){
            System.out.println("You're broke!");
        }
        else if (x<bal) {
            bal -= x;
            ex = x;
            System.out.println("Balance Updated.");
        }
        else{
            System.out.println("Not enough balance.");
        }

    }
    public void showHistory(){
        System.out.println("Last added: " + in);
        System.out.println("Last spent: " + ex);

    }
}
