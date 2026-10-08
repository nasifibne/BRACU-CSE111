package task3;

public class Employee {
        public String name;
        public double salary;
        public double tax;
        public String designation;

        public void newEmployee(String name){
            this.name = name;
            salary = 30000.00;
            designation = "junior";
        }
        public void displayInfo(){
            System.out.println("Employee Name: " + this.name);
            System.out.println("Employee Salary: " + this.salary + " TK");
            System.out.println("Employee Designation: "+ this.designation);

        }
        public void calculateTax(){
            if(salary == 30000){
                System.out.println("No need to pay tax");
            }
            else {
                if (salary > 50000) {
                    tax = salary * .30;
                } else if (salary > 30000) {
                    tax = salary * .10;
                }
                System.out.println(this.name + " Tax Amount: " + tax + " TK");
            }
        }
        public void promoteEmployee(String designation){
            this.designation = designation;
            if (designation.equals("senior")){
                salary +=25000;
            }
            else if( designation. equals("lead")){
                salary +=50000;
            }
            else if (designation.equals("manager")){
                salary +=75000;
            }
            System.out.println(this.name + " has been promoted to " + designation);
            System.out.println("New Salary: "+ salary + " Tk");
        }
}
