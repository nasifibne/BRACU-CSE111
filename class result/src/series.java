import java.util.Scanner;

public class series {
    public static void main(String[] args) {

                Scanner sc= new Scanner(System.in);
                int first = sc.nextInt();
                int change = sc.nextInt();
                int end = sc.nextInt();
                boolean comma = false;
                for (int i = first; i <= end; i += change) {
                    if (comma) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                    comma = true;
                }


    }
}
