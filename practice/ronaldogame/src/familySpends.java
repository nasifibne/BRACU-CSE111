import java.util.Scanner;

public class familySpends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("monthly budget");
        int x = sc.nextInt();
        System.out.println(" grow veg");
        boolean veg = sc.nextBoolean();
        System.out.println("wholesale meat fish");
        boolean fish = sc.nextBoolean();
        double cost=0;
        if (veg && fish ){
            cost = x*.55;
        }
        else if (veg){
            cost = x*.80;
        }
        else if (fish){
            cost = x*.75;
        }
        else {
            cost = x;
        }
        System.out.println( " new cost " + cost);
    }
}
