package home4;

public class TravelPrep {
    public String t_name="unknown package";
    public String placeTemp;
    public int costTemp;
    public String[] place = new String[3];
    public int[] cost = new int[3];
    public int budget=1250;
    public int visit;
    public int total;

    public TravelPrep(){
        System.out.printf("%s would cost at most %d yen\n",this.t_name,this.budget);
    }
    public TravelPrep(String name, int bud){
        this.t_name = name;
        this.budget= bud;
        System.out.printf("%s would cost at most %d yen\n",this.t_name,this.budget);
    }
    public TravelPrep(String s1, String s2){
        placeTemp= s1 +" " + s2;
        costTemp= 300;
        System.out.printf("%s %s costs %d yen\n",s1,s2,costTemp);
    }
    public TravelPrep(String s1, String s2,  int bud){
        placeTemp = s2 +" " + s1;
        costTemp = bud;
        System.out.printf("%s %s costs %d yen\n",s2,s1,bud);
    }
    public void add_to_itinerary(TravelPrep temp){
       if((visit<3) && (total+ temp.costTemp)<=budget) {
           place[visit] = temp.placeTemp;
           cost[visit++] = temp.costTemp;
           total += temp.costTemp;
       }
       else{
           System.out.printf("Budget going overboard\n");
       }
    }
    public void add_to_itinerary(TravelPrep temp1 , TravelPrep temp2){
        add_to_itinerary(temp1);
        add_to_itinerary(temp2);
    }
    public void show_itinerary(){
        System.out.printf("Itinerary for %s\n", this.t_name);
        for(int i =0 ; i<visit ; i++){
            System.out.printf("%d. %s - %d yen\n",(i+1) , place[i] , cost[i]);
        }
        System.out.printf("Total cost of %d destinations: %d yen\n",this.visit,this.total);
    }
    public String updateCost(int bud){
        costTemp += bud;
        String a = "cost of " + placeTemp+ "updated to "+ costTemp;
        return a;
    }
}
