import java.util.Scanner;

public class washingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("weight of clothes\n");
        int wei = sc.nextInt();
        System.out.printf("detergent level \n");
        int det = sc.nextInt();
        if (wei<0 || det <0){
            System.out.printf("invalid input\n");
        }
        else {
            if (det <20 ){
                System.out.printf("insufficient detergent\n");
            }
            else {
                if(wei <=2000){
                    System.out.printf("time estimated 25 minutes\n");
                }
                else if (wei <=4000){
                    System.out.printf("time estimated 35 minutes\n");
                }
                else if (wei <=7000){
                    System.out.printf("time estimated 45 minutes\n");
                }
                else if (wei >7000){
                    System.out.printf("overload\n");
                }
                else if (wei==0){
                    System.out.printf("time estimated 0 minutes\n");
                }

            }
        }

    }
}
