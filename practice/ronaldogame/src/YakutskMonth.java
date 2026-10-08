import java.util.Scanner;

public class YakutskMonth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("monthly budget\n");
        int x = sc.nextInt();
        System.out.printf("temp\n");
        int temp = sc.nextInt();
        double cost=0;
        if (temp <=-10 && temp >-20){
            cost = x *.15;
        }
        else if (temp <= -20 && temp >-30 ){
            cost = x*.30;
        }
        else {
            cost = x*.50;
        }
        System.out.printf("money spent on energy %.2f\n ", cost);
    }
}
