import java.util.Scanner;
public class labquiz{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of n:");
            int n=sc.nextInt();
            double sum=0;
            int digit_count=0;
            double value=0;
            for(int i=1;i<=n;i++){
                System.out.println("Enter digit "+i+":");
                int num=sc.nextInt();
                if(num<0||num>9){
                    System.out.println("Please enter a digit between 0 & 9.");
                    i--;
                }
                else{
                    value=num*Math.pow(10,digit_count);
                    sum=sum+value;
                    digit_count++;
                }
            }
            System.out.println("Constructed number:"+(int)sum);
            int digit=(int)sum;
            int last_digit=digit%10;
            int num2=digit/10;
            int pattern_break=0;
            while(num2>0){
                int another_digit=num2%10;
                if(another_digit<=last_digit){
                    pattern_break++;
                }
                num2=num2/10;
                last_digit=another_digit;
            }
            if(pattern_break==0){
                System.out.println("Pattern check:Valid pattern.");
            }
            else{
                System.out.println("Pattern not broken:"+(pattern_break+1)+" times");
            }
        }
    }
