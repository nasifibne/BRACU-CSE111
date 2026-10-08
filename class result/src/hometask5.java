//ans to the ques no 5
import java.util.Scanner;

public class hometask5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start ; i<=end ; i++){
            int digitCount = 0;
            int arm = i;
            int temp = i;
            while (temp>0){
                temp /=10;
                digitCount++;
            }
            double sum =0;
            while (arm>0){
                int digit = arm%10;
                sum +=Math.pow(digit, digitCount);
                arm /=10;
            }
            if (sum==i){
                System.out.println((int)sum);
            }

        }

    }
}
