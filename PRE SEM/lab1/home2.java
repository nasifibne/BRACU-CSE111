//home2
import java.util.Scanner;
public class home2{
  public static void main(String [] args){

    Scanner sc = new Scanner (System.in);
    String st = sc.nextLine();
    String ns="";
    for(int i = 0 ; i<st.length(); i++){
      char c = st.charAt(i);
      if(c>'a'){
        ns+=(char)(c-1);
      }
      else if(c=='a'){
        ns+='z';
      }
    }
    System.out.println(ns);
    
  }
}