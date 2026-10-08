package home3;

public class CD extends Product {

    public String band;
    public int duration;
    public String genre;

    public CD(int id, String tittle, int price, String band, int duration , String genre){
        super(id, tittle,price);
        this.band= band;
        this.duration = duration;
        this.genre = genre;
    }

    public String printDetail(){
        return getIdTitlePrice()+"\nBand: " + this.band + " Duration: " + this.duration + " Genre: " + this.genre;
    }
}
