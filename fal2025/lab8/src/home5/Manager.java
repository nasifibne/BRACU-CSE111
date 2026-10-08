package home5;

public class Manager extends Employee {

    public double bonus;
    public double finalSalary;

    public Manager(String name, int salary , int hour, int bonus){
        super(name,salary,hour);
        this.bonus = (double) bonus;
    }

    public void calculateSalary(){
        if(getHoursWorked()>40){
            this.finalSalary = getBaseSalary() + (getBaseSalary()*(bonus/100));
        }
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.printf("Bonus: %.1f %%\n",this.bonus);
        System.out.printf("Final Salary: $%.1f\n",this.finalSalary);
    }
    public void requestIncrement(int amo){
        if(getHoursWorked()>100){
            setBaseSalary(getBaseSalary()+amo);
            System.out.println("Full increment approved");
        }
        else if(getHoursWorked()>80){
            setBaseSalary( getBaseSalary()+(amo*0.5));
            System.out.println("$"+(int)(amo*0.5) + " Increment approved" );
        }
        else{
            System.out.println("Increment denied.");
        }
    }
}
