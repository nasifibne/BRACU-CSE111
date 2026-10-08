import java.util.Scanner;
public class task6 {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        int y = sc.nextInt();
        int sum=0;
        for (int i =1; i <=y ; i++){
            if (i%2==0){
                sum = sum - i*i*(-1);
            }
            else {
                sum += (i*i);
            }
        }
        System.out.println(sum);
    }
}
