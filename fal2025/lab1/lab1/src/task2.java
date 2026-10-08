//ans to the ques no 2
import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        for (int i = 0 ; i <st.length() ; i++){
            if(!(st.charAt(i)>='a' && st.charAt(i)<='z')){
                System.out.println("All characters are in small letters ");
            }
        }
        String ns= "";
        for (int i = 0 ; i <st.length() ; i++){
            char c = st.charAt(i);
            if(c=='a'){
                ns +='z';
            }
            else {
                ns = ns + (char) (c-1);
            }
        }
        System.out.println(ns);
    }
}
