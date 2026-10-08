package lab1;

public class Card {
    public String type;
    public double balance;

    public Card(int bal , String type){
        balance = bal;
        this.type = type;
        System.out.printf("%s Card created successfully.\nBalance: %.2f tk\n",this.type, this.balance);
    }
    public void addMoneyFromAccount(int amo , MFS temp){
        if(amo<temp.bal){
            temp.bal -= amo;
            this.balance+= amo;
            System.out.printf("Added %d tk to card from MFS account#%s.\nNew balance in card: %.1f tk\n",amo, temp.accno, this.balance);
        }
        else {
            System.out.printf("Insufficient balance in %s Card.\n",this.type);
        }
    }



}
