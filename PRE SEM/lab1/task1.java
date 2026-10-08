//TASK 1
import java.util.Scanner;
public class task1{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    int sum=0, min=0,max=0,count=0;
    double avg =0;
    //main calc
    for(int i =0; i<10 ; i++){
      int x = sc.nextInt();
      if (x>0 && x%2!=0){
        sum+=x;
        if(x>max){
          max=x;
        }
        if(count==0){
          min=x;
        }
        else if(x<min){
          min=x;
        }
        count++;
      }
    }
    if(count==0){
    System.out.println("No odd positive numbers found");
    }
    else {
      avg = (double)sum/count;
      System.out.println("Sum= " +sum);
      System.out.println("Min= " +min);
      System.out.println("Max= " +max);
      System.out.println("Avarage= " +avg);
    }
  
  }
}