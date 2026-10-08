//task4
import java.util.Scanner;
import java.util.Arrays;
public class task4{
  public static void main (String [] args){

    Scanner sc = new Scanner (System.in);
    System.out.println("row= ");
    int row = sc.nextInt();
    System.out.println("column= ");
    int col = sc.nextInt();
    int [] num = new int [row*col];
    for (int i=0 ; i<(row*col) ; i++){
      num [i] = sc.nextInt();
    }
    int count =0;
    System.out.println("2D array:");
    for (int i =0; i<row ; i++){
      for (int j =0 ; j<col ; j++){
        System.out.print(num[count++]);
      }
      System.out.println();
    }
    System.out.println();
    System.out.println("1D array:");
    System.out.println(Arrays.toString(num));
    
  }
}