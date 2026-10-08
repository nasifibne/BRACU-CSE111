package home5;

public class Developer extends Employee {

    public String language;
    public double finalSalary;

    public Developer(String name, int salary , int hour, String language){
        super(name,salary,hour);
        this.language = language;
    }
    public void calculateSalary(){
        if(this.language.equals("Java")){
            this.finalSalary = getBaseSalary()+ 700;
        }
        else {
            this.finalSalary = getBaseSalary();
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Language: " + this.language);
        System.out.printf("Final Salary: $%.1f\n",this.finalSalary);
    }
}
