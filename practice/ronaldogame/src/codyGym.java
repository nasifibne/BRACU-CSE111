import java.sql.SQLOutput;
import java.util.Scanner;

public class codyGym {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Basic plan cost \n"  );
        int x = sc.nextInt();
        double basic = x;
        double pri = x+ (x*.3);
        double swim = x*.15;
        double basSwim = basic+swim;
        System.out.printf("Codys budget \n");
        int bud = sc.nextInt();
        if (bud> pri){
            System.out.println("Premium plan");
        }
        else if (bud > basSwim){
            System.out.println("basic with swim");
        }
        else {
            double more1 = pri-bud;
            double more2 = basSwim - bud;
            System.out.println("for premium " + more1);
            System.out.println("for basic with swim " + more2);
        }
    }
}
