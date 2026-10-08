public class Calculator {
    public int add;
    public int mul;
    public String st="";

    public void add(int a , int b){
        add = a+b;
        System.out.println(add);
        add=0;
    }
    public void add(int a , int b , int c ){
        add = a+b+ c;
        System.out.println(add);
        add=0;
    }
    public void multiply(int a , int b , int c ){
        mul = a*b*c;
        System.out.println(mul);
        mul=0;
    }
    public void multiply(int a , int b ){
        mul = a*b;
        System.out.println(mul);
        mul=0;
    }
    public void multiply(String a , int b ){
        for (int i = 0 ; i<b-1 ; i++){
            st += a +"-";
        }
        st +=a;
        System.out.println(st);
        st="";
    }


}
