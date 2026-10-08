package home2;

public class Cart {

    public int cartNum;
    public String[] itemName = new String[3];
    public double[] ItemPrice = new double[3];
    public int count;
    public double discount;
    public double total;

    public void create_cart(int i){
        cartNum=i;
    }
    public void addItem(String item , double price){
       if(count<itemName.length) {
           itemName[count] = item;
           ItemPrice[count] = price;
           count++;
           total+=price;
           System.out.printf("%s added to cart %d\n", item, this.cartNum);
           System.out.printf("You have %d item(s) in your cart now.\n",count);
       }
       else{
           System.out.println("You already have 3 items on your cart");
       }
    }
    public void addItem(double price , String item){
        addItem(item , price);
    }
    public void cartDetails(){
        System.out.printf("Your cart(c%d)\n", cartNum);
        for (int i =0; i<count ; i++){
            System.out.println(itemName[i] +" - "+ ItemPrice[i]);
        }
        System.out.printf("Discount Applied: %.1f %%\n", discount);
        System.out.printf("Total price: %f\n" , total);
    }
    public void giveDiscount(int dis){
        discount = dis;
        total = total - (total*dis/100);
    }

}
