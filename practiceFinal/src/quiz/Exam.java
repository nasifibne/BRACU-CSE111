package quiz;

public class Exam {
    public static int temp = 4;
    public static boolean flag;
    public int x,y=2;
    public int sum =3;
    public Exam(){
        y= x+2;
        sum = temp%2;
    }
    public int methodX(Exam m, int n){
        int y =1;
        x= this.y + m.x *temp++;
        sum += m.sum-y+2*n;
        System.out.println(x+ " " + y + " " + sum);
        if(flag== false){
            flag = true;
            Exam4 b = new Exam4(this);
        }
        return sum;
    }
}
