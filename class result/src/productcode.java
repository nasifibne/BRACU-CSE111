import java.util.Scanner;

public class productcode {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int pro= sc.nextInt();
        int qua = sc.nextInt();
        String item ="";
        double price =0;
        if (pro ==1){
            item = "Hot dog";
            price =4;
        }
        else if (pro ==2 ){
            item ="x salaf";
            price =4.50;
        }
        System.out.println("Item " + item);
        System.out.println("quantity "+ qua );
        System.out.println(" total = "+(qua*price));
    }
}
