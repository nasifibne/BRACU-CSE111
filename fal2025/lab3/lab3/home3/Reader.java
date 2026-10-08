package home3;

public class Reader {
    public String name = "New User";
    public int cap = 0;
    public int count = 0;
    public String [] bookArr;

    public Reader(String name){
        this.name = name;
        this.cap = 2;
        bookArr = new String[cap];
        System.out.printf("A new reade is created\n");
    }
    public Reader(String name , int cap){
        this.name= name ;
        this.cap= cap;
        bookArr = new String[cap];
        System.out.printf("A new reade is created\n");
    }
    public void readerInfo(){
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Capacity: %d\n", this.cap);
        System.out.printf("Books\n");
        if(count>0) {
            for (int i = 0; i < count; i++) {
                System.out.printf("Books %d : %s\n", (i+1), bookArr[i]);
            }
        }
        else{
            System.out.printf("No books added yet\n");
        }
    }
    public void addBook(String book){
        if(count<bookArr.length) {
            this.bookArr[count++] = book;
        }
        else{
            System.out.printf("No more capacity\n");
        }

    }
    public void updateCapacity(int cap){
        String[] temp = new String[cap];
        for (int i =0 ; i<count ; i++){
            temp[i] = bookArr[i];
        }
        this.cap = cap;
        bookArr = new String[cap];
        for (int i =0 ; i<count ; i++){
            this.bookArr[i] = temp[i];
        }
        System.out.printf("Capacity has changed to %d\n", this.cap);
    }

}
