//home task 4
public class Employee {

    public String name;
    public double sal = 30000 ;
    public String deg = "junior";

    public void newEmployee(String a ){
        name = a;
    }

    public void displayInfo(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + sal + " TK");
        System.out.println("Employee Designation: " +deg);
    }

    public void promoteEmployee(String b){
        deg = b;
        int inc=0;
        if(b.equals("manager")){
            inc =75000;
        }
        else if (b.equals("lead")){
            inc = 50000;
        }
        else if (b.equals("senior")){
            inc = 25000;
        }
        sal +=inc;
        System.out.println( name + " has been promoted to " + deg);
        System.out.println("new salary " + sal  + " tk");

    }
    public void calculateTax(){
        if (sal==30000){
            System.out.println( "No need to pay tax");
        }
        else if (sal >50000){
            System.out.println(name + " Tax Amount: " + (sal*.3) +" Tk");
        }
        else if (sal>30000){
            System.out.println(name + " Tax Amount: " + (sal*.1) +" Tk");
        }
    }
}
