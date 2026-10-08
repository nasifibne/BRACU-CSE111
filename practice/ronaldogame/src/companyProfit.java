import java.util.Scanner;

public class companyProfit {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.printf("number of region\n");
        int reg = sc.nextInt();
        double max=0;
        String pro="";
        for (int i =1 ; i<= reg ; i++){
            System.out.printf("data for region %d\n",i);
            String name = sc1.nextLine();
            System.out.printf("expenditure\n");
            int expen = sc.nextInt();
            System.out.printf("revenue\n");
            int reve = sc.nextInt();
            double prof = reve - expen;
            if (prof <=0){
                continue;
            }
            else {
                double per  = (prof/expen)*100;
                if (per >= 25 ){
                    System.out.printf("producing profit\n");
                }
                else{
                    System.out.printf("loss\n");
                }
                if (per>max){
                    max = per;
                    pro = name;
                }
            }
        }
        System.out.println("name "+ pro);
        System.out.printf("max %.2f\n",max);
    }
}
