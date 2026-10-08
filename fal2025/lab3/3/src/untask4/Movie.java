package untask4;

public class Movie {
    public String tittle;
    public String director;
    public double rating;
    public String actor="";

    public void setMovieDetails(String tittle , String director){
        this.tittle = tittle;
        this.director = director;
    }
    public void setMovieDetails(String tittle , String director , Double rating){
        setMovieDetails(tittle , director);
        this.rating= rating;
    }
    public void updateRating(double rating){
        this.rating= rating;
        System.out.printf("Updated rating of \"%s\" to %.1f\n", this.tittle , this.rating);
    }
    public void addActors(String actor){
        this.actor += actor + ", ";
        System.out.printf("Added actor \"%s\" to \"%s\".\n",actor , this.tittle);
    }
    public void addActors(String a , String b, String c){
        addActors(a);
        addActors(b);
        addActors(c);
    }
    public void addActors(String a , String b){
        addActors(a);
        addActors(b);
    }
    public void showInfo(){
        System.out.printf("Title: %s\nDirector: %s\nRating: %.1f\nActors: %s\n", this.tittle, this.director, this.rating, this.actor);
    }
}
