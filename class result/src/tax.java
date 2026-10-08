import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int amo= sc.nextInt();
        int age= sc.nextInt();
        double tax=0;
        if (age >=18){
            if (amo<10000){
                tax=0;
            } else if (amo >= 10000 && amo<=20000) {
                tax = amo +(amo*0.05);
            } else if (amo >20000) {
                tax = amo +(amo*.10);
            }
        }
        System.out.println(tax);
    }
}
