public class home6 {
    public static void main(String[] args) {

        int num=6; int divCount=0;
        for (int i=1; i<=num ; i++){
            if (num%i ==0){
                System.out.println(i);
                divCount++;
            }
        }
        System.out.println(divCount);

    }
}
