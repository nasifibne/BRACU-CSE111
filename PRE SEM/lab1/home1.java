//home1
import java.util.Scanner;
public class home1{
  public static void main (String [] args){

    Scanner sc = new Scanner (System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    
    if(end<start){
      int temp = start;
      start = end;
      end = temp;
    }
    int primeCount=0;
    for (int i = start ; i<=end ; i++){
      boolean prime = true;
      for (int j =2 ; j<i ; j++){
        if(i%j==0){
          prime = false;
          break;
        }
      }
      if (prime){
        primeCount++;
      }
    }
  System.out.printf("There are %d prime numbers between %d and %d.\n" , primeCount , start , end);
  }
}