import java.util.Scanner;

public class eidBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("initial salary");
        double sal  = sc.nextDouble();
        System.out.println("start year");
        int sta = sc.nextInt();
        System.out.println("current year");
        int cur = sc.nextInt();
        double incre =0;
        for (int i = sta+1 ; i<= cur ; i ++){
            if (i<= (sta+3)){
                incre = .10;
                sal =sal + (sal * incre);
            }
            else{
                incre = .15;
                sal = sal + (sal * incre);
            }
        }
        double bonus = sal *.25;
        System.out.println("eid bonus "+ bonus);

    }
}
