import java.util.Scanner;

public class grade
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        String grade ="";
        if (num>=90){
            grade = "A";
        } else if (num >=85) {
            grade = "A-";
        } else if (num >=70) {
            grade = "B";
        } else if (num >= 57) {
            grade = "C";
        } else if (num >=50) {
            grade = "D";
        }
        else if (num<50){
            grade ="F";
        }
        System.out.println("Your grade is "+grade );
    }
}
