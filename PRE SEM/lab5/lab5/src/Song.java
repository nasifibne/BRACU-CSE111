public class Song {
    public String title;
    public String artist;
    public int len;
    public int count;

    public Song(String  a , String b , int c){
        title = a;
        artist= b;
        len = c;
    }
    public void songInfo(){
        System.out.println("Title: "+title+ " Artist: "+ artist + " Length: " + len + " minitues");
    }


}
