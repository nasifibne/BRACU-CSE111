import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i=x ; i<=y ; i++){
                int dig = i;
                int sum=0;
                int last_dig= dig%10;
                dig /=10;
                int sec_last = dig %10;
                dig /=10;
                int first_last = dig %10;
                last_dig =(int) Math.pow(last_dig, 3);
                sec_last =(int) Math.pow(sec_last,3);
                first_last=(int) Math.pow(first_last,3);
                sum = last_dig + sec_last + first_last;
                if (sum== i ){
                    System.out.println(i);
                }

        }
    }
}
