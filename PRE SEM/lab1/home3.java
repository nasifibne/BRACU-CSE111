//home 3
import java.util.Scanner;
import java.util.Arrays;
public class home3{
  public static void main(String [] args){

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the length of the array: ");
    int len = sc.nextInt();
    int [] arr = new int [len];
    for (int i =0 ; i<len ; i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    for (int i =0 ; i<(len/2) ; i++){
      int temp = arr[i];
      arr[i] = arr[arr.length-1-i];
      arr[arr.length-1-i] = temp;
    }
    System.out.println("reverse array");
    System.out.println(Arrays.toString(arr));
  }
  
}