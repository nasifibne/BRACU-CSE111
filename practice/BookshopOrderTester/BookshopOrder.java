package BookshopOrderTester;

public class BookshopOrder {
    public String bookname;
    public String status;
    public static double totalprice;
    public double pri;
    public static int order;

    public static void BookshopInfo(){
        System.out.println("Bookshop Status\nActive Orders: " +order);
        System.out.println("Total Revenue: TK" + totalprice);

    }
    public BookshopOrder(String name, double pri){
        this.bookname = name;
        this.pri = pri;
        this.status = "active";
        order++;
    }
    public void displayInfo(){
        System.out.println("Order details:\nBook tittle: " + this.bookname);
        System.out.println("order amount: Tk" +this.pri);
        System.out.println("Status: " + this.status);
    }
    public void completeOrder(){
        totalprice += this.pri;
        this.status = "completed";
        order--;
        System.out.println("Order completed. Revenue added: Tk"+ this.pri);
    }
    public static void payTax(int tax){
        double taxCalc = (totalprice*(tax/100.0));
        System.out.println("Tax paid: tk" + taxCalc);
    }

}
