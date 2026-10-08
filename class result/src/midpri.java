public class midpri {
    public static void main(String[] args) {
        int num =20;
        int i=2, reminder =0;
        boolean isPrime =true , secondpri= true;
        for (; i <num ; i++){
             isPrime =true;
            if (i <=1){
                isPrime= false;
            }
            for (int j=2 ; j < i ; j++) {
                if (i % j == 0) {
                    isPrime = false;

                }
                if (isPrime) {
                     reminder = num -i;
                    //System.out.println(reminder);

                     secondpri= true;
                    if (reminder<=1){
                        secondpri = false;
                    }
                    for (int k =2; k<reminder ; k++ ){
                        if (reminder %k ==0){
                            secondpri = false;
                        }

                    }
                }
            }
            if (reminder>10 ) {
                if (secondpri && isPrime) {
                    if ((i + reminder) == 20) {
                        System.out.println(i + "," + reminder);

                    }
                }
            }
        }
    }
}
