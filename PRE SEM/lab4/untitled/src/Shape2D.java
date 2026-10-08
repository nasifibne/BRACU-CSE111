public class Shape2D {
    public String shape ;
    public double area;
    public int len;
    public int bre;
    public int tri;

    public Shape2D(){
        shape = "Square";
        len = 5;
        bre = 5;
        System.out.printf("A %s has been created with length: %d\n", shape , len);
    }
    public Shape2D(int a , int b ){
        shape = "Rectangle";
        len= a;
        bre = b;
        System.out.printf("A %s has been created with length: %d and breadth: %d\n",shape , len , bre);
    }
    public Shape2D(int a , int b, String t ){
        shape = t;
        len= a;
        bre = b;
        System.out.printf("A %s has been created with height: %d and base: %d\n",shape , len , bre);
    }
    public Shape2D(int a , int b, int t ){
        shape = "Triangle";
        len= a;
        bre = b;
        tri = t;

        System.out.printf("A Triangle has been created with the following sides: %d ,%d ,%d\n",len , bre , tri);
    }

    public void area(){
        if(shape.equals("Triangle")){
            if(tri==0) {
                area = .5 * len * bre;
            }
            else {
                double s = (double) (len + bre + tri) /2;
                area = Math.sqrt(s*(s-len)*(s-bre)*(s-tri));
            }
        }
        else {
            area = len * bre;
        }
        System.out.printf("The area of the %s is: %f\n" , shape , area);
    }


}
