import java.util.Scanner;
public class bank {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int balance = 10000;
        System.out.print(Display a menu inside a loop:\n  1. Check balance \n 2. Deposit money\n 3. Withdraw money \n 4. Exit);

        while (true){
            int menu = sc.nextInt();
            if (menu<0 && menu >=5){
                System.out.println("please enter a positive value");
                return;

            }
            if (menu==2){
                System.out.println("deposite balance");
                int dep = sc.nextInt();
            }
            else if (menu ==3){
                System.out.println("withdeaw balance");
                int with= sc.nextInt();
                if (with <balance){
                    balance -= with;
                    System.out.println("balance");

                }
                else {
                    System.out.println("insufficient balance");
                }
            }
            else if (menu ==4){
                System.out.println("exit");
            }
            else if (menu ==1){
                System.out.println(balance);
            }
        }
    }
}
