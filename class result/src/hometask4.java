import java.util.Scanner;

public class hometask4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Number of Customer : ");
        int cus = sc.nextInt();
        for (int i =1; i<= cus ; i++){
            System.out.printf("Item Number for Customer- %d : ",i);
            int item = sc.nextInt();
            double sum =0;
            for (int  j=1 ; j <=item ; j++){
                System.out.printf("Item- %d: ",j);
                int cost = sc.nextInt();
                sum +=cost;
            }
            double avg = sum/item;
            System.out.printf("Average for Customer-%d : %.1f\n ",i , avg);
        }

    }
}
