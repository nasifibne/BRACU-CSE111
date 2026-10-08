public class Shape {
    public String name;
    public double area;
    
    public void setParameters(String s , double x){
        name =s;
        area = 3.1416*x*x;
    }
    public void setParameters(String s , double x1, double x2){
        name =s;
        if (name.equals("Triangle")){
            area = .5*x1*x2;
        }
        else if (name.equals("Rectangle")){
            area = x1*x2;
        }

    }
    public String details(){
        String a = "Shape Name: " +name + "\nArea: "+ area;
        return a;
    }
    
}
