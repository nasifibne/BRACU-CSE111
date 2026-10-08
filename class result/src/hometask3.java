// ans to the ques no 3
import java.util.Scanner;
public class hometask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i= start; i<=end ; i++){
            boolean isPrime = true;
            for (int div = 2 ; div <=i ; div++){
                if (i %div==0){
                    isPrime= false;
                    break;

                }
                System.out.println(i);
                break;
            }

        }
    }
}
