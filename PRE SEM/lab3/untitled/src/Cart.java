public class Cart {
    public double total;
    public double dis;
    public double[] amo= new double[3];
    public String[] pro= new String[3];
    public int count;
    public int cart;

    public void create_cart(int x){
        cart =x;
    }

    public void addItem(String s, double x){
       if(count>2){
           System.out.println("You already have 3 items on your cart");
       }
       else {
           pro[count] = s;
           amo[count] = x;
           count++;
           total+=x;
           System.out.println(s + " is added to cart " + cart);
           System.out.printf("You have %d item(s) in your cart now.\n", count);
       }
    }
    public void addItem(double x , String s){
        addItem(s,x);
    }
    public void cartDetails(){
        System.out.printf("your cart (c%s)\n",cart);
        for (int i =0 ; i<count ;i ++){
            System.out.println( pro[i] + " - " + amo[i]);
        }
        System.out.printf("Discount applied: %.4f%% \n",dis );
        System.out.println("Total price: "+total);
    }
    public void giveDiscount(int x){
        dis= x;
        total =total -(total*.10);
    }
}
