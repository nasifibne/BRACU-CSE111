import java.util.Scanner;
public class mubin {
        public static void main(String[] args){
            System.out.println("Please input a number");
            Scanner sc1= new Scanner(System.in);
            int primecount=(sc1.nextInt());
            int divcount=1;
            int divfound=0;
            int primesfound=0;
            int i=0;
            while(primecount>primesfound){
                divcount++;
                i=1;
                divfound=0;
                for(;i<=divcount;i++){
                    if(divcount%i==0){
                        divfound++;
                    }
                }
                if(divfound==2){
                    System.out.println(divcount);
                    primesfound++;
                }
            }
        }
    }

