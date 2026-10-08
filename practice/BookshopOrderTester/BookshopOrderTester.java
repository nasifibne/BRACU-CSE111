package BookshopOrderTester;

public class BookshopOrderTester {
    public static void main(String[] args) {
        BookshopOrder.BookshopInfo();
        System.out.println("=====1=====");
        BookshopOrder order1 = new BookshopOrder("The Great Gatsby", 300.0);
        BookshopOrder order2 = new BookshopOrder("Data Structures", 400.0);
        order1.displayInfo();
        order2.displayInfo();
        System.out.println("=====2=====");
        BookshopOrder.BookshopInfo();
        System.out.println("=====3=====");
        order1.completeOrder();
        System.out.println("=====4=====");
        order1.displayInfo();
        System.out.println("=====5=====");
        BookshopOrder.BookshopInfo();
        BookshopOrder order3 = new BookshopOrder("Physics Fundamentals", 500.0);
        System.out.println("=====6=====");
        order3.completeOrder();
        System.out.println("=====7=====");
        order3.displayInfo();
        System.out.println("=====8=====");
        BookshopOrder order4 = new BookshopOrder("History of Art", 350.0);
        order4.completeOrder();
        System.out.println("=====9=====");
        BookshopOrder.BookshopInfo();
        System.out.println("=====10=====");
        BookshopOrder.payTax(10);
    }
}