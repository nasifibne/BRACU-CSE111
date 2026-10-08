import java.util.Arrays;
import java.util.Scanner;
public class classresult {
    public static void main (String [] args){
        Scanner sc =new Scanner (System.in);
        int count = sc.nextInt();
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int f=0;
        for (int i=1; i<=count; i++){
            int mark = sc.nextInt();
            if (mark >=80){
                a ++;
            }
            else if (mark >=70){
                b++;
            }
            else if (mark >=60){
                c++;
            }
            else if (mark >=50){
                d++;
            }
            else {
                f++;
            }


        }
        System.out.printf("output :  A: %d, B: %d, C: %d, D: %d, F: %d", a,b,c,d,f);
    }
}
