import java.util.Scanner;

public class restaurantHappyHour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("hour you visit\n");
        int hour = sc.nextInt();
        System.out.printf("total price\n");
        int pri = sc.nextInt();
        if (hour >=10 && hour <=12){
            System.out.printf("total price = %d\n",pri);
            double disPri= pri - ((pri *hour)/100.0);
            System.out.println("discount parcentage " + hour + "%");
            System.out.printf("total price after discount %.2f\n",disPri);
        }
        else if (hour >=8 && hour <=10){
            System.out.printf("no discount available . total price %d", pri);
        }
        else {
            System.out.printf("input the time within operator\n");
        }

    }
}
