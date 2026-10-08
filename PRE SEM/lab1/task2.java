//task2 
import java.util.Scanner;
public class task2{
  public static void main (String [] args){

    Scanner sc = new Scanner (System.in);
    String s1= sc.nextLine();
    String s2= sc.nextLine();
    String ns = s1 + " " +s2;
    int sum=0;
    System.out.println(ns);
    for (int i=0 ; i<ns.length() ; i++){
      char c = ns.charAt(i);
      if ((c>='A' && c<='Z') || (c>='a' && c<='z')){
        sum+=c;
      }
    }
    System.out.println(sum);
  
  }
}