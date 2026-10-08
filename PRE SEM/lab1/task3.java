//task3
import java.util.Scanner;
import java.util.Arrays;
public class task3{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    //input 
    System.out.print("N: ");
    int x = sc.nextInt();
    double [] arr = new double[x];
    double [] newarr = new double[x];
    System.out.println("Please enter the elements of the array:");
    for (int i =0 ; i<x ; i++){
       arr[i]= sc.nextDouble();
    }
    
    //calc
    newarr[0] = arr[0];
    int unicou=1;
    for (int i =1; i <arr.length ; i++){
      boolean uni=true;
      for (int j =0 ; j<unicou ; j++){
        if(arr[i] == newarr[j]){
          uni = false; 
          break;
        }
      }
      if(uni){
        newarr[unicou++]= arr[i];
      }
      
    }
    double [] finalarr = new double [unicou];
    for (int i=0 ; i<unicou ; i++){
      finalarr[i] = newarr[i];
    }
    System.out.println(Arrays.toString(finalarr));
    System.out.println(newarr.length-finalarr.length);
  }
}