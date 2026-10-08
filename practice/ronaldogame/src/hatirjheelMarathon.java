import java.util.Scanner;

public class hatirjheelMarathon {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("days i pactice\n");
        int x = sc.nextInt();
        System.out.printf("days saad practice\n");
        int y = sc.nextInt();
        double xsum=0, ysum=0;
        for (int i=1; i<=x ; i++){
            System.out.printf("running speed of my in (km/h)\n");
            double xspee = sc.nextInt();
            xsum +=xspee;
        }
        for (int j =1; j<=y ; j++){
            System.out.printf("running speed of saad in (km/h)\n");
            double yspee = sc.nextInt();
            ysum += yspee;
        }
        double xavg = xsum/x;
        double yavg = ysum/y;
        System.out.printf("my avg speed %.2f\n",xavg);
        System.out.printf("saad's avg speed %.2f\n",yavg);
        // for 5 km
        System.out.printf("approximate time (int hour) for 5 km \n");
        System.out.println("i need "+ (xavg*5));
        System.out.println("saad need " + (yavg*5));

    }
}
