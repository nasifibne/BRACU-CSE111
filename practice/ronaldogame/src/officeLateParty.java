import java.util.Scanner;

public class officeLateParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("total employee\n");
        int em = sc.nextInt();
        int sum=0;
        for (int i =1;i<=em ; i++) {
            System.out.println("for employee " + i);
            for (int j = 1; j <= 30; j++) {
                System.out.printf("is they come late on %d\n", j);
                boolean late = sc.nextBoolean();
                if (late) {
                    sum++;
                }
            }
        }
        double total = sum *.5;
        System.out.printf("total fee %.2f ",total);
    }
}
