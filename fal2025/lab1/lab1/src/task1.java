//ans to the ques no 1
import java.util.*;
public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        if(max<min){
            int temp = min;
            min = max;
            max = temp;
        }
        int prime=0;
        for (int i = min ; i<max ; i++){
            boolean flag = true;
            for (int j =2 ; j<i ; j++){
                if(i%j==0){
                    flag =false;
                    break;
                }
            }
            if(flag){
                prime++;
            }
        }
        System.out.printf("There are %d prime numbers between %d and %d.\n", prime , min , max);
    }
}
