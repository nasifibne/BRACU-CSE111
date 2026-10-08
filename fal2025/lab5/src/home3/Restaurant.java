package home3;

public class Restaurant {
    public String res;
    public String loc;
    public UberEatsUser[] order = new UberEatsUser[3];
    public int count;

    public Restaurant(String res , String loc){
        this.res = res;
        this.loc = loc;
    }

    public void takeOrder(UberEatsUser user){
        boolean flag = false;
        for(int i = 0 ; i<count ; i++){
            if(user == order[i]){
                flag = true;
            }
        }
        if(flag){
            System.out.printf("You already have a pending order!\n");
        }
        else {
            if(count<3 ){
                if(!(user.loc.equals("unknown"))){
                    order[count++] = user;
                    System.out.printf("Your order has been added!\n");
                }
                else {
                    System.out.printf("Location : Unknown. Please update your location information!\n");
                }
            }
            else{
                System.out.printf("We are really busy right now. Please order after some time. Thank you!\n");
            }
        }

    }

    public void completeOrders(){
        if(count>0){
            System.out.printf("Showing %s's orders:\n",this.res);
            for (int i = 0 ; i<count ; i++){
                System.out.printf("Order by %s at %s completed\n",order[i].name, order[i].loc);
            }
            for (int i = 0 ; i<count ; i++){
                order[i] = null;
            }
            count=0;
        }
        else {
            System.out.println("No pending orders at the moment.");
        }
    }

}
