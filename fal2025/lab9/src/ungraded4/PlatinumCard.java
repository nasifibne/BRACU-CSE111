package ungraded4;

public class PlatinumCard extends CreditCard{
    public PlatinumCard(String name , String acc){
        super(name,acc,100);
    }
    public void spendCash(int amo){
        System.out.println("Previous Reward Points: "+ this.rewardPoints);
        this.rewardPoints+=(amo/50);
        System.out.println("Reward points after spending " + amo + " taka " + this.rewardPoints);
    }
}
