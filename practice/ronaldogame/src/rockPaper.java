import java.util.Scanner;

public class rockPaper {
    public static void main(String[] args) {
        System.out.printf(" 1 refers to rock \n 2 refers to paper \n 3 refers to scissors\n");
        Scanner sc= new Scanner(System.in);
        System.out.printf("first choice\n");
        int fir = sc.nextInt();
        System.out.printf("second choice\n");
        int sec = sc.nextInt();
        if (fir ==1 ){
           if (sec ==3){
               System.out.printf("first win\n");
           }
           else {
               System.out.printf("second win\n");
           }
        }
       else if (fir ==2){
           if (sec ==1){
               System.out.printf("first win\n");
           }
           else {
               System.out.printf("second win\n");
           }
       }
       else if (fir ==3){
           if (sec == 2){
               System.out.printf("first win \n");
           }
           else{
               System.out.printf("second win\n");
           }
        }

    }
}
