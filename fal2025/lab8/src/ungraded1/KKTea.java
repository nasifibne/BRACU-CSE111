package ungraded1;

class KKTea extends Tea {
    public int teaBags;
    public static int regularCount = 0;
    public static int flavouredCount = 0;

    // Constructor for Regular KK Tea
    public KKTea(int price, int teaBags) {
        super("KK Regular Tea", price);
        this.teaBags = teaBags;
    }

    // Constructor used by subclass to set custom names
    protected KKTea(String name, int price, int teaBags) {
        super(name, price);
        this.teaBags = teaBags;
    }

    // Overriding productDetail (Polymorphism)
    @Override
    public void productDetail() {
        super.productDetail(); // Prints Name, Price, and Status
        System.out.println("Weight: " + (teaBags * 2) + ", Tea Bags: " + teaBags);
    }

    public static void updateSoldStatusRegular(KKTea t) {
        t.status = true;
        regularCount++;
    }

    public static void totalSales() {
        System.out.println("Total Sales: " + (regularCount + flavouredCount));
        System.out.println("KK Regular Tea: " + regularCount);
        if (flavouredCount > 0) {
            System.out.println("KK Flavoured Tea: " + flavouredCount);
        }
    }
}