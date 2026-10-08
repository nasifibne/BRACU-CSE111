package lab1;

public class Circle extends Shape {
    //Your Code Here
    public int radius;
    public double area;

    public void area(){
        this.area = 3.1416*radius*radius;
        System.out.println("Area of "+ this.color + " " + this.name + " "+ area );
    }
}
