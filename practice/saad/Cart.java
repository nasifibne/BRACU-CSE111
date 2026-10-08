import java.util.*;

public class Cart {
    public String[] item = new String[3];
    public int cart = 0;
    public double[] price = new double[3];
    public int count = 0;
    public double total = 0;
    public double discount = 0.0;

    public void create_cart(int a){
        this.cart = a;
    }
    public void addItem(String a,double b ){
        if (count<3) {
            this.item[count] = a;
            System.out.println(item[count]+" was added to cart "+cart);
            this.price[count]=b;
            count++;
            System.out.println("you have added "+count+" item(s) in your cart");
        }
        else {
            System.out.println("You already have 3 items on your cart");
        }
    }
    public void addItem(double b ,String a ){
        addItem( a, b);
    }
    public void cartDetails(){
        for (int i =0; i<this.count; i++){
            System.out.println(item[i]+" - "+ price[i]);
        }
        for (int i=0;i<this.count;i++){
            this.total += this.price[i];
        }
        this.total = total - (total*(discount/100.0));
        System.out.println("discount applied : "+discount+"%");
        System.out.println("total price " +total);
    }
    public void giveDiscount(int a){
        this.discount = a;
    }
}