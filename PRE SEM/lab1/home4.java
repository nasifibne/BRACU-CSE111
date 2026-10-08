//home4
import java.util.Scanner;
public class home4{
  public static void main (String [] args){
  Scanner sc = new Scanner (System.in);
   
  System.out.print("N: ");
  int n = sc.nextInt();
  int [] arr = new int [n];
  for (int i =0 ; i <n ; i++){
    arr[i] = sc.nextInt();
  }
  
  int finarr [] = new int[n];
  finarr[0] = arr[0];
  int count=1;
  for (int i =1 ; i<n ; i++){
    boolean uni = true;
    for (int j =0 ; j<count ; j++){
      if(arr[i] == finarr[j]){
        uni = false;
        break;
      }
    }
    if(uni){
      finarr[count++]= arr[i];
    }
  }
  
  int [] fin = new int [count];
  for (int i =0 ; i<count ; i++){
    fin[i] = finarr[i];
  }
  
  for (int i =0 ; i<fin.length ; i++){
    int call =0;
    for (int j =0 ; j<arr.length ; j++){
      if (fin[i] == arr[j]){
        call++;
      }
    }
    System.out.println(fin[i] +" - " + call + " time(s)");  
  }
  
  
  }
}