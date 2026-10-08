package task6;

public class Patient {
    public static int total;
    public static int outpatient;
    public String id;
    public String name;
    public String dct;

    public Patient(String name , String dct){
        this.name = name;
        this.dct = dct;
        outpatient++;
        id = "P0" + (++total);
    }
    public String toString(){
        return "Patient id: " + this.id + ", Name: " + this.name+ "\nDoctor: " + this.dct;
    }
    public static void details(){
        System.out.println("Total patients: " +total);
    }
    public static void details(Patient[] patients){
        System.out.println("Details of "+patients.length+" selected patients:");
        for (int i = 0; i < patients.length; i++) {
            System.out.println("== == == == ==");
            System.out.println(patients[i].toString());

        }
    }



}
