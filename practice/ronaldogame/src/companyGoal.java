import java.util.Scanner;

public class companyGoal {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        int tsum=0;
        int sum= 0;
        for (int i =1 ; i<=5 ; i++){
            System.out.printf("worker %d\n",i);
            for (int j =1; j<=7 ; j++){
                System.out.printf("for day %d\n",j);
                int work = sc.nextInt();
                sum =0;
                sum +=work;
                tsum += work;
            }
            if (sum >=50){
                System.out.printf("worker %d meet the goal\n",i);
            }
        }

        if (tsum>=250){
            System.out.printf("weekly goal achieve\n");
        }
    }
}
