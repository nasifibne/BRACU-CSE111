public class A{
   public int x = 1, y = 2, p = 12;
   public A(){
     this.x = x + 5;
     int x = 2;
     int p = x + this.metB(23, 56);
     System.out.println(p + " " + x + " " + this.p);
   } 
   public void metA(int n, int m) {
       p = x + this.x % m * 3;
       y = this.y + metB(x++) + p;
       System.out.println(this.x +" " + x + y + " " + p) ;
   }
   public int metB(int p, int n) {
       p += n;
       A a2 = this;
       System.out.println(a2.p +" " + p + " " + (this.x++)) ;
       a2.metA(11,55);
       return a2.y;
   }
   public int metB(int y) {
       if(y % 2 == 0) {
           int temp = this.metB(2, y);
           return temp;
       }
       else{
           return 4 + this.p;
      }
   }
}
