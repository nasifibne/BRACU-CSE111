import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int year = sc.nextInt();
        boolean isleap = true;
        if (year %4==0 && year %100!=0){
            isleap = true;
        } else if (year%400 ==0){
            isleap = true;
        } else {
            isleap = false;
        }
        if (isleap){
            System.out.println(year + " is leap year ");
        }
        else {
            System.out.println(year + " not a leap year");
        }
    }
}
