import java.util.Scanner;

public class fuel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int km = sc.nextInt();
        double fuel = sc.nextDouble();
        double result = km/fuel;
        System.out.printf("%.3f km/l \n",result);





    }
}
