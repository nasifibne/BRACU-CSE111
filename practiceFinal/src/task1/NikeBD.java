package task1;

public class NikeBD {

    public static int branch;
    public static int sold;
    public int Bsold;
    public static String[] product = new String[]{"Jordan","Cortez","Kobe"};
    public static int[] qua = new int[3];
    public  int[] Branchquan = new int[3];
    public String name;

    public NikeBD(String name){
        this.name= name;
        branch++;
    }

    public void restockProducts(String pro , int qua){
        for (int i = 0; i < product.length; i++) {
            if(pro.equals(product[i])){
                this.qua[i] += qua;
                this.Branchquan[i] += qua;

            }
        }
    }
    public void restockProducts(String[] pros , int[] quas){
        for (int i = 0; i < pros.length; i++) {
            restockProducts(pros[i],quas[i]);
        }
    }
    public void productSold(String pro , int qua){
        for (int i = 0; i < product.length; i++) {
            if(pro.equals(product[i])){
                this.qua[i] -= qua;
                this.Branchquan[i] -= qua;
                sold +=qua;
                Bsold +=qua;
            }
        }
    }
    public void productSold(String pro1 , int qua1, String  pro2 , int qua2){
        productSold(pro1,qua1);
        productSold(pro2,qua2);
    }
    public void details(){
        System.out.println("Nike "+ this.name+" Status:");
        System.out.print("Products Currently Stocked: ");
        for (int i = 0; i < product.length; i++) {
            System.out.print( product[i] +": " + Branchquan[i] + " ");
        }
        System.out.println();
        System.out.println("Sold: " + Bsold);
    }

    public static void status(){
        System.out.println("Nike Bangladesh Status:");
        System.out.println("Branches Opened: "+branch);
        System.out.print("Products Currently Stocked: ");
        for (int i = 0; i < product.length; i++) {
            System.out.print( product[i] +": " + qua[i] +" ");
        }
        System.out.println();
        System.out.println("Sold: " + sold);
    }
}
