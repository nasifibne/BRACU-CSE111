import java.util.Scanner;
public class numberStatistic {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        boolean y = true;
        int even=0, odd=0, highest=0, lowest=0;
        while (y){
            int x = sc.nextInt();
            if (x==-1){
                y= false;
            }
            else {
                if (x%2==0){
                    even++;
                }
                else if (x%2!=0) {
                    odd++;
                }
                if (highest < x){
                    highest =x;
                }
                if (lowest >x){
                    lowest =x;
                }
            }
        }
        System.out.printf("Output: Even: %d, Odd: %d, Highest: %d, Lowest: %d", even , odd , highest, lowest);
    }
}
