import java.util.Scanner;

public class excerciseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("number of steps\n");
        int x = sc.nextInt();
        System.out.printf("number of minutes\n");
        int y = sc.nextInt();
        if (x == 10000 && y== 100){
            System.out.printf("daily goal achieve \n");
        }
        else {
            double per = (x*100)/10000.0;
            System.out.printf("percentage of goal %.2f\n",per);
        }
    }
}
