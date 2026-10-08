import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        double sum=0,tdis=0, tsum=0;
        String shop = "yes";
        while (shop.equals("yes")){
            System.out.printf("name\n");
            System.out.printf("price\n");
            int pri = sc.nextInt();
            System.out.printf("quantity\n");
            int qua = sc.nextInt();
            System.out.printf("category\n");
            String cat = sc1.nextLine();
            double bill=0, offer =0;
            bill = pri *qua;
            sum +=bill;
            if (qua >10){
                offer = bill -(bill*.10);
            }
            if (cat.equals("electronics")){
                offer = bill -(bill*.5);
            }
            else if (cat.equals("clothing")){
                offer = bill -(bill*.15);
            }
            tsum = offer;
            System.out.printf("original cost %f\n", bill);
            double dis = bill - offer;
            System.out.printf("discount applied %f\n",dis);
            System.out.printf("final price %f\n",offer);
            System.out.printf("do you want to continue shopping\n");
            String shop1 = sc1.nextLine();
            if (shop1.equals("yes")){
                shop = "yes";
            }
            else  {
                shop = "no";
            }
        }
        System.out.printf("total cost %f\n",sum);
        tdis = sum - tsum;
        System.out.printf("total amount of discount %f\n",tdis);
        System.out.printf("fiinal cost %f \n", tsum
        );
    }
}
