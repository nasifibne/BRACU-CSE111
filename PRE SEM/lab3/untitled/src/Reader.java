public class Reader {
    public String name="New User";
    public int cap=0;
    public String[] book;
    public int count;

    public String createReader(String s , int x){
        name =s;
        cap =x;
        book = new String[cap];
        return "A new reader is created!";
    }
    public void readerInfo(){
        System.out.println("Name: " + name);
        System.out.println("Capacity: " +cap);
        System.out.println("Books:");
        if(count==0){
            System.out.println("No books added yet");
        }
        else{
            for (int i =0 ; i<count ; i++){
                System.out.println("Book "+ i + ": " + book[i] );
            }
        }
    }
    public void addBook(String a ){
       if(count<cap) {
           book[count++] = a;
       }
       else{
           System.out.println("No more capacity");
       }
    }

}
