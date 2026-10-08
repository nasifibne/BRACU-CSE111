// ans to the ques no 1
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int step = sc.nextInt();
        for (int i =1; i<=step ; i++){
            int first = sc.nextInt();
            int count = sc.nextInt();
            int sum = 0;
            if (first %2==0){
                first ++;
            }
            else {
                first = first;
            }
            for (int j = 1 ; j <= count ; j++ ){
                sum +=first;
                first +=2;
            }
            System.out.println(sum);
        }
    }
}
