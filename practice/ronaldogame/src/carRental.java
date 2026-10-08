import java.util.Scanner;

public class carRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Car type");
        String car = sc.nextLine();
        System.out.printf("days");
        int day = sc.nextInt();
        System.out.printf("is it a weekend");
        boolean week = sc.nextBoolean();
        int bill=0;
        if (car.equals("economy")){
            bill = 500;
        }
        else if (car.equals("standard")){
            bill = 300;
        }
        else if (car.equals("luxury")){
            bill =100;
        }
        bill = bill*day;
        if (day >7){
            bill -= (bill * .1);
        }
        if (week){
            bill -= (bill*.05);
        }
        System.out.println(bill);

    }
}
