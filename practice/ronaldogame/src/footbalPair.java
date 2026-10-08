import java.util.Scanner;

public class footbalPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("player 1 jersey number\n");
        int pla1 = sc.nextInt();
        System.out.printf("player 2 jersey number\n");
        int pla2 = sc.nextInt();
        int sum = pla2 + pla1;
        boolean isPrime = true;
        for (int i =2; i<sum ; i++){
            if (sum %i==0){
                isPrime = false;
            }

        }
        if (isPrime) {
            System.out.printf("perfect pair\n");
        }
        else {
            System.out.printf("not a pair\n");
        }
    }
}
