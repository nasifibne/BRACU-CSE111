import java.util.Scanner;

public class home8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int num = sc.nextInt();
        int n= num;
        int digitcount=0;
        int div =1;
        while (n>0){
            digitcount++;
            n/=10;
        }

        for (int i =1; i <digitcount; i++){
            div = div*10;
        }
        while (div >0){
            int pri = num / div;
            if (div <10){
                System.out.print(pri);
            }
            else {
                System.out.print(pri + " , ");
            }
            num %=div;
            div /=10;
        }

    }
}
