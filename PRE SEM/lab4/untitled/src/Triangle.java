public class Triangle {
    public double peramiter;
    public int len1;
    public int len2;
    public int len3;


    public Triangle(int a , int b , int c){
            len1 = a;
            len2 = b;
            len3 = c;
    }

    public void triangleDetails(){
        System.out.printf("Three sides of the triangle are: %d, %d, %d\n",len1,len2,len3);
        peramiter  = len1+len2+len3;
        System.out.println("Perameter " + peramiter);
    }
    public String printTriangleType(){
        if(len3== len2 && len3 == len1){
            return "This is an Equilateral Triangle.";
        }
        else if(len3!=len1 && len1!= len2 && len2!= len3 ){
            return "This is a Scalene Triangle.";
        }
        else{
            return "This is a Isosceles Triangle.";
        }
    }
    public void compareTriangles(Triangle t){
        int pera = len1+len2+len3;
        int pera1 = t.len1+t.len2+t.len3;
        if (len3==t.len3 && len2==t.len2 && len1==t.len1 && this!=t ){
            System.out.println("Addresses are different but the sides of the triangles are equal.");
        }
        else if(this == t){
            System.out.println("These two triangle objects have the same address.");
        }
        else if(pera == pera1){
            System.out.println("Only the perimeter of both triangles is equal.");
        }
        else{
            System.out.println("Addresses, length of the sides and perimeter all are different.");
        }

    }
}
