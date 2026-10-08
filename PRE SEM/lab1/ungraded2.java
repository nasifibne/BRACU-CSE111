//ungraded 2
import java.util.*;
public class ungraded2{
  public static void main (String [] args){
  
    Scanner sc = new Scanner (System.in);
    int [] arr = new int [5];
    for (int i=0 ; i<5 ; i++){
      arr[i] = sc.nextInt();
    }
    int min=arr[0], max=arr[0], minind=0, maxind=0;
    for (int i =1 ; i<arr.length ; i++){
      if(arr[i]<min){
        min = arr[i];
        minind = i;
      }
      if(arr[i]>max){
        max = arr[i];
        maxind = i;
      }
    }
   System.out.printf("The largest number %d was found at location %d\n",max,maxind);
   System.out.printf("The smallest  number %d was found at location %d\n",min,minind);
  }
}