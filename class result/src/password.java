import java.util.Scanner;
public class password {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int found=1, count=0;
        for (int i=1; i<=3; i++){
            System.out.printf("Attempt %d:",i);
            String att= sc.nextLine();
            if (att.equals("brac123")){
                System.out.println("correct → Access Granted");
                System.out.println("attempts " + found);
                break;
            }
            else {
                System.out.println("wrong password");
                count++;
                if (count ==3){
                    System.out.printf("%d wrong attempts , account locked", count);
                }
            }
            found++;


        }
    }
}
