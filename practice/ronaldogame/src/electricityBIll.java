import java.util.Scanner;

public class electricityBIll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Unit consumed\n");
        int uni = sc.nextInt();
        int bill=0;
        if (uni <= 100){
            bill = uni *5;
        }
        else if (uni >100 && uni <= 300){
            bill = (100*5)+ (uni-100)*8;
        }
        else {
            bill = 100*5 + 200 * 8+ (uni-300)*10;
        }
        System.out.printf("Total bill = %d BDT", bill);
    }
}
