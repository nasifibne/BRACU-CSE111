public class primecheck {

        public static void main(String[]args){
            int num=20;
            int div1=0;
            int div2=0;
            int divfound1=0;
            int divfound2=0;
            int remainder=0;


            while(div1<num){
                div1++;
                divfound1=0;
                div2=0;
                for(int i=1;i<=div1;i++){
                    if((div1%i)==0){
                        divfound1++;
                    }
                }
                if(divfound1==2){
                    remainder=(20-div1);
                    while (remainder>div2 && (remainder>10)){
                        div2++;
                        divfound2=0;
                        for(int j=1;div2>=j;j++){
                            if((div2%j)==0){
                                divfound2++;
                            }
                        }
                        if(divfound2==2 && ((div1+div2)==20)){
                            System.out.println(div1+" , "+div2);
                        }
                    }
                }
            }
        }

}
