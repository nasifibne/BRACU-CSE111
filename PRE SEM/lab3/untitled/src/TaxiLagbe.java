public class TaxiLagbe {
    public String num;
    public String area;
    public String[] pass= new String[4];
    public int tk;
    public int count;

    public void storeInfo(String s , String a){
        num = s;
        area = a;
    }
    public void addPassenger(String s , int x){
        if(count>3){
            System.out.println("Taxi Full! No more passengers can be added");
        }
        else {
            pass[count++] = s;
            tk += x;
            System.out.println("Dear " + s + "! Welcome to TaxiLagbe");
        }
    }
    public void addPassenger(String s , int x, String s1 , int x1){
        addPassenger(s,x);
        addPassenger(s1,x1);
    }
    public void printDetails(){
        System.out.println("Taxi number: " +num);
        System.out.printf("This taxi can cover %s area\n" , area);
        System.out.println("Total Passenger: " + count);
        System.out.println("Passenger Lists: ");
        for(int i =0 ; i<count ; i++){
            System.out.print(pass[i] + " ");
        }
        System.out.printf("\nTotal collected fare: %d Taka\n", tk);
    }

}
