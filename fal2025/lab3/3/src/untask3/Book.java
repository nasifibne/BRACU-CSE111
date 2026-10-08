package untask3;

public class Book {
    public String tittle;
    public String Author="unknown";
    public String genre;
    public int page;

    public void createBook(String tittle){
        this.tittle = tittle;
    }
    public void createBook(String tittle, String author){
        this.tittle= tittle;
        this.Author = author;
    }
    public void createBook(String tittle, String author , String genre){
        createBook(tittle, author);
        this.genre= genre;
    }
    public void customizeGenre(String genre){
        this.genre = genre;
        System.out.printf("Updated genre of \"%s\" to %s.\n",this.tittle,this.genre);
    }
    public void customizePages(int page){
        this.page = page;
        System.out.printf("Updated pages of \"%s\" to %d pages.\n",this.tittle, this.page);
    }
    public void displayDetails(){
        System.out.printf("Title: %s, Author: %s, Genre: %s, Pages: %d\n",this.tittle, this.Author, this.genre, this.page);
    }



}
