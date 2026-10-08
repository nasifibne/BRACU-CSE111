package lab2;

public class NetflixUser {
    public String name;
    public String plan;
    public boolean flag;
    public Movie[] movie = new Movie[3];
    public int count;

    public NetflixUser(String name){
        this.name = name;
        flag = false;
        plan = "Free";
        System.out.printf("New user account created!\n");
    }

    public NetflixUser(String name , String plan){
        this.name = name;
        this.plan = plan;
        if(plan.equals("Free")){
            flag = false;
        }
        else {
            flag = true;
        }
        System.out.printf("New user account created!\n");
    }
    public void addToFavourites(Movie temp){
        if(this.flag){
            if(count<3){
                movie[count++] = temp;
                System.out.printf("Movie added to favourites.\n");
            }
            else {
                System.out.printf("Cannot add new movies. Favourites list is full.\n");
            }
        }
        else {
            System.out.printf("Cannot add movies to favourites.Please upgrade to Netflix Premium.\n");
        }
    }
    public void  showFavourites(){
        if(flag){
            System.out.printf("Showing %s Favourites:\n",this.name);
            for (int i =0 ; i < count ; i++){
                System.out.printf("%s, %s, Duration: %s\n",movie[i].movie,movie[i].genre,movie[i].duration);
            }
        }
        else{
            System.out.printf("No available favourites. Please upgrade to Netflix Premium.");
        }
    }
    public void upgradePlan(){
        if(!flag) {
            this.plan = "Premium";
            this.flag = true;
            System.out.printf("Welcome to Netflix Premium!\n");
        }
        else {
            System.out.printf("You already have Netflix Premium!\n");
        }
    }

}
