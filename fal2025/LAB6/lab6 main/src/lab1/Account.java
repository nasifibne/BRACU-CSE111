package lab1;

public class Account {
    public String name;
    public String address;
    private double balance;

    public static String bankName ="Badda Bank";
    public static int count;
    public static double totalBalance;

    public Account(String name, String loc){
        this.name = name;
        this.address = loc;
        Account.count++;
    }
    public void setBalance(double bal){
        this.balance +=bal;
        Account.totalBalance +=bal;
    }
    public double getBalance(){
        return this.balance;
    }
    public void printInfo(){
        System.out.println( "Name: " + name + " " +", address: "+ address);
        System.out.println("Balance: " + balance +" Taka ");
    }


}
