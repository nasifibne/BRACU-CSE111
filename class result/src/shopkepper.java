import java.util.Scanner;
public class shopkepper {
    public static void main (String [ ] args){
        Scanner sc= new Scanner (System.in);
        boolean y= true, n=false;
        int last=0;
        while (y){
            System.out.println("price");
            int pri= sc.nextInt();
            System.out.println("quantity");
            int qua = sc.nextInt();
            sc.nextLine();
            if (qua >10){
                double total = (pri *qua)-((pri*qua)*.1);
                System.out.printf("discount applied; Subtotal = %.0f", total);
                last +=total;
            }
            else {
                int total =(pri * qua);
                System.out.printf("Subtotal = %d", total);
                last +=total;
            }
            System.out.println("\nY/N");
            String step = sc.nextLine();
            if (step.equals("n")){
                y =n;
                break;
            }
            else {
                y=y;
            }
        }
        System.out.println("total "+last);
    }
}
