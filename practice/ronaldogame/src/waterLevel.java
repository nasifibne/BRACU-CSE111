import java.util.Scanner;

public class waterLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("initial reservoir");
        double res = sc.nextDouble();
        System.out.println("percentage increase ");
        double per = sc.nextDouble();
        System.out.println("number of days");
        int day = sc.nextInt();
        System.out.println("percentage of water consume");
        double con = sc.nextDouble();
        double waterG =0, wateruse=0;
        for (int i =1; i <=day ; i++){
            System.out.println("for day " +i);
            System.out.println("starting water " + res);
            double add = res * (per/100.0);
            waterG +=add;
            double rain = res + add;
            System.out.println(" amount added by rainfall " + add);
            double use = res * (con/100.0);
            wateruse +=use;
            System.out.println("amount consumed " + use);
            double last = rain -use;
            System.out.println(" final levfel " + last);
            res = last;
        }
        System.out.println("water gained " +waterG);
        System.out.println("water use " + wateruse);
    }
}
