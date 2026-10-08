package lab4;

public class Borrower{
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};

    // Your Code here
    public String name;
    public String[] borrowBook = new String[9];
    public int count;


     public static void bookStatus(){
        System.out.println("Available books");
        for(int i =0 ; i<book_count.length ; i++){
            System.out.println(book_name[i] +":" + book_count[i]);
        }
    }

    public Borrower(String name){
         this.name = name;
    }
    public void borrowerDetails(){
        System.out.printf("Name: %s\n",this.name );
        System.out.println("Books Borrowed:");
        for (int i = 0 ; i<count ; i++){
            System.out.println(borrowBook[i]);
        }
    }
    public void borrowBook(String book){
        boolean flag = false;
        int temp =0;
        for (int i = 0 ; i<book_count.length ; i++){
            if(book.equals(book_name[i])){
                flag = true;
                temp = i;
            }
        }
        if(count<9){
            if(flag && remainingBooks(book)>0){
                borrowBook[count++]= book;
                book_count[temp]--;
            }
            else {
                System.out.println("this book is not available");
            }
        }
        else {
            System.out.println("not enough space to borrow");
        }

    }
    public static  int remainingBooks(String book){
        for (int i = 0 ; i<book_name.length ;i++){
             if(book.equals(book_name[i])){
                 return book_count[i];
             }
        }
         return 0;
    }
}
