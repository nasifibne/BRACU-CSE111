import java.util.Scanner;

public class amcientMystery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;){
            System.out.printf("n th term\n");
            int x = sc.nextInt();
            if (x%2==1){
                System.out.println("n th term "+ (x-1));
            }
            else {
                System.out.println("nth term " + ((x/2)-1) );
            }
        }

    }
}
