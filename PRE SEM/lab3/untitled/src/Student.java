public class Student {
    public String name="Not Set";
    public String dept = "CSE";
    public double cg= 0.0;
    public int credit = 9;
    public String sco = "Not set";

    public void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("Department: " +dept );
        System.out.println("CGPA: " + cg);
        System.out.println("Credits: " +credit);
        System.out.println("Scholarship Status: " + sco);
    }
    public void updateDetails(String s , double c , int x){
        name = s; cg = c ; credit=x;
    }
    public void updateDetails(String s , double c , int x , String d){
        name = s; cg = c ; credit=x; dept =d;
    }
    public void updateDetails(String s , double c){
        name = s; cg = c ;
    }
    public void checkScholarshipEligibility(){
        if(cg>= 3.5 && credit>10) {
            if (cg >= 3.7){
                sco = "Merit based scholarship";
            System.out.println(name + " is eligible for " + sco);
            }
            else {
                sco ="Need based scholarship";
                System.out.println(name + " is eligible for " +sco);
            }
        }
        else{
            sco = " no scholarship";
            System.out.println(name +" is not eligible for scholarship");
        }

    }
}
