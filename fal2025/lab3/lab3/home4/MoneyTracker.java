package home4;

public class MoneyTracker {
    public String name;
    public double bal;
    public double lastAdd;
    public double lastSpent;

    public MoneyTracker(){
        System.out.printf("A new money tracker has been launched.\n");
    }
    public String info(){
        String a = "Name: " + this.name+ "\nCurrent Balance: " + bal;
        return a;
    }
    public void createTracker(String name){
        this.name = name;
        bal = 1.0;
    }
    public void income(int income){
        this.bal+=income;
        this.lastAdd= income;
        System.out.printf("Balance Updated.\n");
    }
    public void expense(int expense){
        if(bal==expense){
            lastSpent = expense;
            System.out.printf("You're broke!\n");
        }
        else if(this.bal<expense){
            System.out.printf("Not enough Balance\n");
        }
        else if (this.bal>expense){
            bal -= expense;
            this.lastSpent = expense;
            System.out.printf("Balance Updated.\n");
        }
    }
    public void showHistory(){
        System.out.printf("Last Added: %.1f\nLast spent: %.1f\n",this.lastAdd , this.lastSpent);
    }

}
