package ungrade1;

public class SultansDine {

    public static int branch;
    public static int total;
    public static SultansDine[] loc = new SultansDine[3];

    public String name;
    public int tk;
    public double percentage;

    public SultansDine(String name){
        loc[branch++] = this;
        this.name = name;
    }

    public void sellQuantity(int qua){
        if(qua<10){
            tk = qua*300;
        }
        else if(qua<20){
            tk = qua*350;
        }
        else {
            tk= qua*400;
        }
        total +=tk;
        percentage = ((double) tk/total)*100;

    }
    public void branchInformation(){
        System.out.println("Branch Name: "+ this.name);
        System.out.println("Branch Sell: "+ this.tk + " taka");
    }

    public static void details(){
        System.out.println("Total Number of branch(s): "+ branch);
        System.out.println("Total Sell: "+total);
        if(branch>0){
            for (int i = 0; i < branch; i++) {
                loc[i].branchInformation();
                System.out.println("Branch consists of total sell's " + loc[i].percentage);
            }
        }
    }
}
