import java.util.Scanner;

public class prrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        int j =2;
        for (int i =1; i<=n ; i++){


            for (int k =2; k<j ; k++){
                if (j %k ==0){
                    isprime = false;
                    break;
                }
            }
            j++;

        }
        if (isprime){
            System.out.println(j);
        }
    }
}
