package lab1;

public class MFS {
    public String accno;
    public double bal;
    public boolean flag;
    public Card card;

    public MFS(String acc){
        accno = acc;
        System.out.printf("Account Created.\nAccNo: %s\nBalance: %.2f tk\n",this.accno,this.bal);
        if (flag) {
            System.out.printf("Card saved.\n");
        }
        else {
            System.out.printf("Card not saved.\n");
        }
    }
    public void addMoneyFromCard(int amo){
        if(flag){
            if(amo<card.balance){
                bal += amo;
                card.balance -= amo;
                System.out.printf("Transfer Successful\nNew MFS account balance: %.1f tk.\nCard balance: %.1f\n",this.bal, this.card.balance);
            }
            else {
                System.out.printf("Insufficient balance in %s Card.\n",this.card.type);
            }
        }
        else{
            System.out.printf("Please add a card to your MFS account\n");
        }
    }
    public void addNewCard(Card temp){
        flag = true;
        if(card ==null) {
            this.card = temp;
        }
        else {
            System.out.printf("only 1 card can be store");
        }
        System.out.printf("%s Card added to MFS acc#%s\n",temp.type, this.accno);
    }


}
