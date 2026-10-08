public class decreasing {
    public static void main(String[] args) {

                int digit = 85963;
                int temp=digit;
                int digCount=0;
                int temp1=0, temp2=0;
                int count=0;
                while (digit>0){
                    digit /= 10;
                    digCount++;
                }


                for (int i= digCount; i>1 ; i-- ){
                    temp1= temp/(int)Math.pow(10,(i-1));
                    temp2= temp/(int)Math.pow(10,(i-2));
                    temp2 %= 10;
                    if (temp1>temp2){
                        count++;
                    }
                    else {
                        break;
                    }
                }
                if (count == (digCount-1)){
                    System.out.println("valid");
                }
                else {
                    System.out.println("invalid");
                }





    }
}
