import java.util.Scanner;

public class vehicles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("initial number of vehicles");
        int veh = sc.nextInt();
        System.out.println("monthly growth percentage");
        double gro = sc.nextDouble();
        System.out.println("reduce amount");
        int red = sc.nextInt();
        System.out.println("total num of month");
        int mon = sc.nextInt();
        for (int i =1; i<=mon ; i++){
            veh +=(veh*(gro/100));
            if (i%6==0){
                veh -=red;
            }

        }
        System.out.println("number of vehicles " + veh);
    }
}
