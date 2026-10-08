//ungraded3
import java.util.*;
import java.util.Arrays;
public class ungraded3{
  public static void main (String [] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int [] arr = new int [n];
  for (int i  =0 ; i<n ; i++){
    arr[i] = sc.nextInt();
  }
  for (int i=0 ; i<arr.length-1 ; i++){
    for (int j =0 ; j<arr.length-1-i; j++){
      if(arr[j] > arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
      }
    }
  }
  System.out.println(Arrays.toString(arr));
  double mid=0;
  if(n%2!=0){
  mid = arr[ n/2];
  }
  else{
    int mid1 = arr[n/2-1];
    int mid2= arr[n/2];
    mid = (mid1+mid2)/2;
  }
   System.out.println("The median is " +(int) mid);
  }
}