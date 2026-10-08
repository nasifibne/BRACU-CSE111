import java.util.Scanner;
public class task2 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int i =sc . nextInt();
        int sum=0;
        for (int x=1; x<=i ; x++){
            int num= sc.nextInt();
            sum +=num;
        }
        System.out.println(sum);
        System.out.println((double)(sum/i));
    }
}
