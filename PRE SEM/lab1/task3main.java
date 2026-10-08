// task3 main 
import java.util.Scanner;
import java.util.Arrays;
public class task3main{
  public static void main (String [] args){
    //input
    Scanner sc = new Scanner (System.in);
    System.out.print("N: ");
    int x = sc.nextInt();
    double [] arr1 = new double [x];
    for (int i =0 ; i<x ; i++){
      arr1[i] = sc.nextDouble();
    }
    double[] arr2 = new double [x];
     System.out.println(Arrays.toString(arr1));
      System.out.println(Arrays.toString(arr2));
    //calc
    int count =1;
    arr2[0] = arr1[0];
    for (int i =1 ; i<x ; i++){
      boolean uniq = true;
      if (arr1[i] == arr1[i-1]){
        uniq = false;
      }
      if(uniq){
        arr2[count++] = arr1[i]; 
      }
    }
    double[] finarr = new double [count];
    for (int i =0 ; i<count ; i++){
      finarr[i]= arr2[i];
    }
    System.out.println("New Arrays : " +Arrays.toString(finarr));
    System.out.println("Removed elements: " + (arr2.length - finarr.length));
  }
}