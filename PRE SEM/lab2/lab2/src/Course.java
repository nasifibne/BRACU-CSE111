import java.lang.classfile.attribute.SourceFileAttribute;
//task3
public class Course {
    public String name;
    public String code;
    public int credit;

    public void updateDetails(String a , String b , int c){
        name = a ;
        code = b ;
        credit = c;
    }

    public void displayCourse() {
        System.out.println("course name " +name);
        System.out.println("course code " +code);
        System.out.println("course credit " +credit);
    }
}
