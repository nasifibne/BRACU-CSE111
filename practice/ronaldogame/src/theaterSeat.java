import java.util.Scanner;

public class theaterSeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter row number\n");
        int row = sc.nextInt();
        System.out.printf("enter per row seat number\n");
        int seat = sc.nextInt();
        for (int i =1; i<= row ; i++){
            for (int j =1 ; j<= seat ; j++){
                if (j%5==0){
                    System.out.printf("VIP seat %d - %d\n", i,j);
                }
                System.out.printf("General seat %d -%d\n", i,j);
            }
        }
    }
}
