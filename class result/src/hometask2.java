//ans to the ques no 2
import java.util.Scanner;
public class hometask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int wid = sc.nextInt();
        for (int i =1; i<=wid ; i++){
            for (int j = 1 ; j <= len ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
