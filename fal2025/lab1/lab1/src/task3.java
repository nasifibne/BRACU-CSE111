//ans to the ques no 3
import java.util.*;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("N= ");
        int n = sc.nextInt();
        int [] IntArr= new int [n];
        for (int i = 0 ; i<n ; i++){
            IntArr[i] = sc.nextInt();
        }
        int [] tempArr = new int[n];
        int unique=0;
        for (int i =0 ; i<IntArr.length ; i++){
            boolean flag = true;
            for (int j =0 ; j<unique ; j++){
                if(IntArr[i]==tempArr[j]){
                    flag = false;
                }
            }
            if(flag){
                tempArr[unique++] = IntArr[i];
            }
        }
        int [] finArr = new int[unique];
        for(int i = 0 ; i< unique ; i++){
            finArr[i] = tempArr[i];
        }
        for (int i = 0 ; i<finArr.length ; i++){
            int count =0 ;
            for (int j =0 ; j<IntArr.length ; j++){
                if (finArr[i] == IntArr[j]){
                    count++;
                }
            }
            System.out.printf(finArr[i] + " - " + count + " time(s)\n" );
        }
    }
}
