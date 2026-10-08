public class Playlist {
    public String list;
    public Playlist(String a ){
        list=a;
        System.out.println(a + " created");
    }
    public void info(){
        System.out.println(list + " has the following songs:");
        if(count==0){
            System.out.println("No songs in First Playlist.");
        }
    }
}
