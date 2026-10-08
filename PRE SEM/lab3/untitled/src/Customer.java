public class Customer {
    public String name ;
    public String[] item = new String[4];
    public  int[] pri= new int [4];
    public int count=0;
    public int total;
    public void createCustomer(String a){
        name = a;
    }
    public  void addItem(String a , int x){
       if(count<4) {
           item[count] = a;
           pri[count] = x;
           System.out.println(a + " added to cart");
           count++;
       }
       else{
           System.out.println("Cart is full");
       }
    }

    public  void addItem(String a , int x , String a1 , int x1){
        if(count+1<4) {
            item[count] = a;
            pri[count] = x;
            item[count+1] = a1;
            pri[count+1] = x1;
            System.out.println( a + " and " + a1 +  " added to cart");
            count+=2;
        }
        else{
            System.out.println("Cart is full");
        }

    }
    public void showCart(){
        System.out.println("Customer: " + name);
        if(count==0){
        }
        else {
            for(int i =0 ; i<count ; i++){
                System.out.println("Item: " + item[i] + " Price: " + pri[i]);
            }
        }
    }
    public void calculatePrice(){
        for (int i =0 ; i<count ;i ++){
            total+=pri[i];
        }
        System.out.println("Total: " + total);
    }
}
