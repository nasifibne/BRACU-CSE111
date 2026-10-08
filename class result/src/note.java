import java.util.Scanner;
public class note {
        public static void main(String [] args){

            Scanner sc= new Scanner (System.in);
            System.out.println("Enter the amount the customer need to pay(Taka)");
            int pay= sc.nextInt();
            System.out.println("Enter the amount, customer gave(Taka)");
            int give= sc.nextInt();

            if (give < pay){
                pay = pay - give ;
                System.out.println(pay);
            }
            else if (give == pay){
                System.out.println("The returned amount is 0 taka.");
            }
            else {
                give = give-pay;
                int bal100=0, bal50=0, bal20=0, bal10=0;
                bal100 = give /100;
                give %=100;
                bal50 = give /50;
                give %=50;
                bal20 = give /20;
                give%= 20;
                bal10 = give /10;
                give %= 10;
                System.out.println("100 taka note: "+bal100);
                System.out.println("50 taka note: "+ bal50);
                System.out.println("20 taka note: "+bal20);
                System.out.println("10 taka note: "+bal10);
            }





//            int back= give-pay;
//
//            if (back > 0){
//                System.out.printf("The returned amount is %d taka.\n", back);
//                int back100=0;
//                int back50=0;
//                int back20=0;
//                int back10=0;
//                int back5=0;
//                int back2=0;
//                int back1=0;
//
//                if (back>=100){
//                    back100= back/100;
//                    back %=100;
//                }
//                if (back>=50){
//                    back50 = back /50;
//                    back %=50;
//                }
//                if (back >=20){
//                    back20 = back/20;
//                    back %=20;
//                }
//                if (back>=10){
//                    back10 = back/10;
//                    back %= 10;
//                }
//                if (back>=5){
//                    back5 = back/5;
//                    back %= 5;
//                }
//                if(back>=2){
//                    back2 = back/2;
//                    back %=2;
//                }
//                if (back>=1){
//                    back1 = back;
//                }
//                System.out.println("100 taka note: "+back100);
//                System.out.println("50 taka note: "+ back50);
//                System.out.println("20 taka note: "+back20);
//                System.out.println("10 taka note: "+back10);
//                System.out.println("5 taka coin: "+back5);
//                System.out.println("2 taka coin: "+back2);
//                System.out.println("1 taka coin: "+back1);
//            }
//            else if (back <0){
//                back = back *(-1);
//                System.out.printf("Please pay %d taka more.\n",back);
//            }
//            else {
//                System.out.println("The returned amount is 0 taka.");
//            }
//        }
    }

}
