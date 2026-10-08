package ungrade3;

public class Student {
    public static int total;
    public static int cse;
    public static int other;

    public int id;
    public String name;
    public double cgpa;
    public String dept="CSE";

    public Student(String name , double cgpa){
        this(name,cgpa,"CSE");
    }
    public Student(String name , double cgpa , String dept){
        id = ++total;
        this.name = name;
        this.cgpa = cgpa;
        this.dept= dept;
        if(dept.equals("CSE")) {
            cse++;
        }
        else {
            other++;
        }
    }

    public static Student createStudent(String nm , double cg){
        Student st = new Student(nm,cg);
        return st;

    }

    public static void printDetails(){
        System.out.println(" total student " + total);
        System.out.println(" cse " + cse);
        System.out.println(" other " + other);
    }
    public void individualDetail(){
        System.out.println("id " + this.id);
        System.out.println("name " + this.name);
        System.out.println("cgpa " + this.cgpa);
        System.out.println("dept " + this.dept);
    }



}
