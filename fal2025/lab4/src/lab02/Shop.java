package lab02;

public class Shop {
    public String name = "Mega";
    public int cap;
    public String[] product = new String[4];
    public int[] price = new int [4];
    public int count;


    public Shop(String name , int cap){
        this.name = name;
        this.cap = cap;
        System.out.printf("%s shop created! \n" , this.name);
    }
    public Shop(int cap){
        this.cap = cap;
        System.out.printf("%s shop created! \n" , this.name);
    }
    public void info(){
        System.out.printf("Shop Name: %s\nIem Details:\n", this.name);
        if(count>0){
            System.out.printf("%d/%d\n",this.count,this.cap);
            for(int i =0 ; i<count ; i++){
                System.out.printf("%s - %d Tk\n",this.product[i] , this.price[i]);
            }

        }
        else{
            System.out.printf("No items in shop\n");
        }
    }
    public void addItem(String pro , int pri){
        if(count<this.cap) {
            this.product[count] = pro;
            this.price[count++] = pri;
        }
        else{
            System.out.printf("%s, could not be added\n",pro);
        }
    }
    public void addItem(Shop s , String s1){
        boolean flag = false;
        for (int i=0 ; i<s.count ; i++){
            if(s.product[i].equals(s1)){
                flag = true;
                if(this.count<this.cap) {
                    this.product[count] = s.product[i];
                    this.price[count++] = s.price[i] ;
                }
                else{
                    System.out.printf("%s, could not be added\n", s1);
                }
            }
        }
        if(!flag){
            System.out.printf("%s, not found in %s!\n",s1, s.name);
        }
    }
    public void purchase(String s1){
        boolean flag = false;
        for(int i =0 ; i<count ; i++){
            if(this.product[i].equals(s1)){
                flag = true;
            }
        }
        if(flag){
            System.out.printf("Purchase Complete!\n");
        }
        else {
            System.out.printf("%s, is not available in this shop\n",s1);
        }
    }

}
