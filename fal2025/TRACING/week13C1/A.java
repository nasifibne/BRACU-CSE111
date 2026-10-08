public class A{

  public static int x = 10;
  public int y = 20;

  public A(){
    m2();
  }
  public void m1(){
    int x = 50;
    System.out.println(x);
    System.out.println(this.x);
    System.out.println(A.x);
    System.out.println(B.x);
  }
  public void m2(){
    System.out.println("A " + x);
  }
}