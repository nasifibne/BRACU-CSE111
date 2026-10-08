import java.util.Scanner;

public class yserise {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        double y =1.000;
        for (double i =2; i<=n ; i++){
            if (i%4==0){
                y = y - (1/i);
            }
            else {
                y = y + (1/i);
            }
        }
        System.out.printf("%.3f",y);

    }
}
