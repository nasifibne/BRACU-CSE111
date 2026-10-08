package lab1;

public class Shape2D {
    public int length=5;
    public int width;
    public int height;
    public double area;
    public String name = "Square";

    public Shape2D(){
        System.out.printf("A %s has been created with length: %d\n",name , length);
    }
    public Shape2D(int a , int b){
       this.name = "Rectangle";
       this.length=a;
       this.width= b;
        System.out.printf("A %s has been created with length: %d and breadth: %d\n",this.name, this.length , this.width);
    }
    public Shape2D(int a , int b , String nm){
        this.name = nm;
        this.length=a;
        this.width=b;
        System.out.printf("A %s has been created with height: %d and breadth: %d\n",this.name, this.length , this.width);
    }
    public Shape2D(int a , int b , int c){
        this.name = "Triangle";
        this.length=a;
        this.width=b;
        this.height = c;
        System.out.printf("A %s has been created with the following sides: %d, %d, %d\n",this.name, this.length , this.width, this.height);
    }


    public void area(){
        if(this.name.equals("Square")) {
            area = length * length;

        }
        else if(this.name.equals("Rectangle")){
            area= length*width;

        }
        else if(this.name.equals("Triangle")){
            if(height==0){
                area = .5*this.length*this.width;
            }
            else{
                double s = (this.length+ this.width + this.height)/2;
                area = Math.sqrt(s*(s-length)*(s-width)*(s-height));
            }
        }
        System.out.printf("The %s of the Square is: %f\n",this.name, area);
    }
}
