package ungraded4;

public class SignatureCard extends CreditCard{

    public SignatureCard(String name , String acc){
        super(name,acc,200);
    }
    public void spendCash(int amo){
        System.out.println("Previous Reward Points: "+ this.rewardPoints);
        this.rewardPoints+=(amo/25);
        System.out.println("Reward points after spending " + amo + " taka " + this.rewardPoints);
    }
    public void cardDetails(){
        super.cardDetails();
        System.out.println("Possible Number of Companions for Lounge: 5");
    }

}
