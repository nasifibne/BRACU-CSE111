import java.util.Scanner;

public class ronaldogame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a 4 digit number - ");
        int num = sc.nextInt();
        while (num>0){
            int last = num % 10;
            boolean isPrime= true;
                for (int i = 2; i < last; i++) {
                    if (last % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.printf("%d is prime.\n", last);
                }
                else {
                    System.out.println(last + " not prime ");
                }
            num /=10;

        }
    }
}
