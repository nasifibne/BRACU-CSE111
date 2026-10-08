public class prime20 {
    public static void main(String[] args) {


        int num =20;
        int first =0, second =0;
        for (int i =1; i<=num ; i++){
            boolean isPrime = true;
            if (i<=1){
                isPrime= false;
            }
            else {
                for (int j =2; j<i ; j++){
                    if (i%j==0){
                        isPrime = false;
                        break;
                    }
                }
            }
            first = i;
        }
        num -= first;
        System.out.println(num);

    }
}
