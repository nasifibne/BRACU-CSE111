package quiz;

public class Exam4 extends  Exam{
    public static int x = -12;
    public int sum = 8;
    public Exam4(){
        x=-6;
        y= x/temp;
        super.sum = temp+2;
    }
    public Exam4( Exam a){
        x =a.sum + super.x;
        this.methodY(x+2 , y*3);
        sum = a.sum+super.sum;
    }
    public void methodY(int m , int n){
        int x =2;
        y = m + ++temp;
        int s = methodX(this,x);
        sum = x+s-n;
        System.out.println(x+ " " + y + " " + sum);
    }
}
