public class Library {
    public int cap;
    public int count;
    public String name="";

    public void setBookCapacity(int x){
        cap =x;
    }
    public void addBook(String s ){
        if(count<cap) {
            name = name + s + "\n";
            System.out.println("Book '" + s + "' added to the library");
            count++;
        }
        else{
            System.out.printf("Exceeds maximum capacity. You can't add more than %d books\n", cap);
        }

    }
    public void printDetail(){
        System.out.printf("Maximum Capacity: %d\n",cap);
        System.out.printf("Total Books: %d\n",count);
        System.out.printf("Book list: \n");
        System.out.printf(name);
    }
}
