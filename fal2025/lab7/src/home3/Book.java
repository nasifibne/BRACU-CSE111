package home3;

public class Book extends Product {
    public String ISBN;
    public String publisher;

    public Book(int id, String tittle, int price, String isbn, String publisher){
        super(id, tittle,price);
        this.ISBN= isbn;
        this.publisher= publisher;
    }
    public String printDetail(){
        return getIdTitlePrice()+"\nISBN: " + this.ISBN + " Publisher: " + this.publisher;
    }
}
