public class Shelf {
    public int capacity;
    public int num;

    public void showDetails(){
        System.out.println("Shelf Capacity: " + capacity);
        System.out.println("Number of Books: " + num);
    }
    public void addBooks(int x){
        if(capacity==0){
            System.out.println("Zero capacity. Cannot add books.");
        }
        else{
            num+=x;
            if(num>capacity){
                System.out.println("capacity exceed");
                num -=x;
            }
            else{
                System.out.println(x+ " books added to shelf");
            }
        }

    }

}
