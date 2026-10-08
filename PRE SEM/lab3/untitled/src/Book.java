public class Book {
    public String name ;
    public String author= "unknown" ;
    public String genre ;
    public int page;
    public int book;

    public void createBook(String a ){
        name= a;

    }
    public void createBook(String a , String b ){
        name = a;
        author = b;
    }
    public void createBook(String a , String b , String c ){
        name = a;
        author = b;
        genre = c;
    }
    public void customizeGenre(String a ){
        genre = a;
        System.out.println("Updated genre of '"+ name +"' to " + genre);
    }
    public void customizePages(int  a ){
        page = a;
        System.out.println("Updated page of '"+ name +"' is " + page);

    }
    public void displayDetails(){
        System.out.println("Title: "+name + ", Author: "+ author+ ", Genre: " + genre + ", Pages: " + page);
    }
}
