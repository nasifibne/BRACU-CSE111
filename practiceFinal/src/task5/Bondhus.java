package task5;

public class Bondhus extends SocialMedia{

    public String sentBox= null;
    public int sent;

    public Bondhus(String name, String email){
        super(name,email);
    }
    public void showSentbox(){
        System.out.println(this.userName + "'s Sentbox:");
        if(sentBox== null){
            System.out.println("No sent messages.");
        }
        else {
            System.out.println(sentBox);
        }
    }
    public void sendMessage(String msg){
        if(sent<5) {
            if (sentBox == null) {
                sentBox = msg;
            } else {
                sentBox += "\n" + msg;
            }
            sent++;
        }
        else {
            System.out.println("Sentbox is full.");
        }
    }
    public String toString(){
        return super.toString() + "\nMassage Sent: " + this.sent ;
    }

}
