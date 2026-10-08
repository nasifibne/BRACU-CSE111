import java.util.Scanner;

public class librarianSelf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("books in a row\n");
        int k = sc.nextInt();
        System.out.printf("book\n");
        int n = sc.nextInt();
        int self =0, empty =0;
        for (int i =1; i<=n ; i++){
            if (i%k==0){
                self++;
            }
            if (self %3==0) {
                self++;
                empty++;
            }

        }
        int lastBook = n - (k*(self-empty));
        System.out.println("self " +self);
        System.out.printf("last row book %d",lastBook);

    }
}
