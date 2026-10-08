package lab2;

public class Movie {
    public String movie;
    public String genre;
    public String duration;

    public Movie(String movie , String genre ,String duration){
        this.movie = movie;
        this.genre = genre;
        this.duration = duration;
    }
    public Movie(String movie , String genre ){
        this.movie = movie;
        this.genre = genre;
        this.duration = "unknown";
    }

}
