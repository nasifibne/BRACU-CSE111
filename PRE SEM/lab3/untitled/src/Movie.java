public class Movie {
    public String title ;
    public String director ;
    public double rat ;
    public String actor=""; ;

    public void setMovieDetails(String a , String b , double x){
        title = a;
        director = b;
        rat = x;
    }
    public void setMovieDetails(String a , String b ){
        title = a;
        director = b;
        rat = 0;
    }
    public void addActors(String a ){
        if(actor.length()==0){
            actor = a;
        }
        else{
            actor = actor+ ", " + a;
        }
        System.out.println("Added actor \""+ a + "\" to \"" + title + "\".");
    }
    public void addActors(String a , String b){
        addActors(a);
        addActors(b);
    }
    public void addActors(String a , String b , String c) {
        addActors(a);
        addActors(b);
        addActors(c);
    }
    public void updateRating (double x){
            rat =x;
        System.out.println("Updated rating of \" " + title + " \" to " + rat);
    }
    public void showInfo(){
        System.out.println("Tittle: " + title);
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rat);
        System.out.println("Actors: " + actor);
    }
}
