package home1;

public class Product {

    public static String[] pName = new String[3];
    public static int[] pQau = new int[3];
    public static int count;

    public Product(String product , int qua){
        if(count<pName.length){
            pName[count]= product;
            pQau [count++] = qua;
            System.out.println("Stored: " + product);
        }
        else{
            System.out.println("Storage is full! Cannot add " + product);
        }
    }
    public static void displayProducts(){
        System.out.println("=== Stored Products ===");
        for (int i = 0; i < pName.length; i++) {
            System.out.println(pName[i] + ": - Qty: " + pQau[i]);
        }
    }
    public static void buy(String pro , int amo){
        boolean flag = false;
        int temp=0;
        for (int i = 0; i < pName.length; i++) {
            if(pName[i].equals(pro)){
                flag = true;
                temp=i;
            }
        }
        if(flag){
            if(amo<pQau[temp]){
                pQau[temp] = pQau[temp] - amo;
                System.out.println("Product Sold");
            }
            else {
                System.out.println("Quantity low");
            }
        }
        else {
            System.out.println("Product not found");
        }
    }


}
