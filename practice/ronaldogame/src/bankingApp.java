import java.util.Scanner;

public class bankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter your pin code\n");
        int code = sc.nextInt();
        int zero =0, one =0, tw0 = 0, three=0, four=0, five=0, six =0, seven=0, eight=0, nine=0;
        while (code >0){
            int digit = code %10;
            if (digit==0){zero++;}
            else if (digit==1){one ++;            }
            else if (digit==2){tw0++;}
            else if (digit==3){three++;}
            else if (digit==4){four++;}
            else if (digit==5){five++;}
            else if (digit==6){six++;}
            else if (digit==7){seven++;}
            else if (digit==8) {eight++;}
            else if (digit==9){nine++;}
            code /=10;
        }
        System.out.printf("frequewncy of digits\n");
        System.out.printf("0: %d\n",zero);
        System.out.printf("1: %d\n",one);
        System.out.printf("2: %d\n",tw0);
        System.out.printf("3: %d\n",three);
        System.out.printf("4: %d\n",four);
        System.out.printf("5: %d\n",five);
        System.out.printf("6: %d\n",six);
        System.out.printf("7: %d\n",seven);
        System.out.printf("8: %d\n",eight);
        System.out.printf("9: %d\n",nine);
    }
}
