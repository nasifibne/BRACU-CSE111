package task6;

public class InPatient extends Patient {

    public String dept;
    public static int inpatient;
    public InPatient(String name, String dct , String dept){
        super(name, dct);
        this.dept =dept;
        inpatient++;
        outpatient--;
        System.out.println("New patient admitted in "+ this.dept);
    }
    public String toString(){
        return super.toString() + "\nDepartment: " + this.dept;
    }
    public static void details(){
        System.out.println("Total patients: " +total);
        System.out.println("Admitted In-Patients: "+inpatient);
        System.out.println("Out patients "+ outpatient);
    }


}
