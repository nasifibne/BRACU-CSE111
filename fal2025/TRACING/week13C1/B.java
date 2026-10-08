public class B extends A
{
  public static int x = 30;
  public int y = 40;
  public int sum = -6;
  public B() {
    super();
    System.out.println("B "+sum);
  }
  public void m2(){
    System.out.println("B m2 "+sum);
  }
//  public void m1(){
//    int x = 60;
//    System.out.println(x);
//    System.out.println(this.x);
//    System.out.println(super.x);
//    System.out.println(A.x);
//    System.out.println(B.x);
//  }
}