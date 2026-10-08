//ungrader 1
import java.util.Scanner;
import java.util.Arrays;
public class ungraded1{
  public static void main (String [] args){
    
    Scanner sc = new Scanner (System.in);
    System.out.print("N: ");
    int x = sc.nextInt();
    int [] arr = new int [x];
    for (int i =0 ; i<x ; i++){
      arr[i] = sc.nextInt();
    }
    
    System.out.print("remove ele= ");
    int rem = sc.nextInt();
    System.out.println("input arrays");
    System.out.println(Arrays.toString(arr));
    
    boolean flag= false;
    for (int i =0 ; i<arr.length ; i++){
      if(arr[i] == rem){
        flag = true;
      }
    }
    if(flag){
    System.out.println("final arrays");
    for (int i =0 ; i<arr.length ; i++){
      if(arr[i] != rem){
        System.out.print(arr[i] +" ");
      }
    }
    }
    else {
     System.out.println("Element not found");
    }
  }
}