package home3;

public class Student {
    public String email="null";
    public String password="null";
    public String[] course=new String[3];
    public String status="null";;
    public String name;
    public String dept;
    public int id;
    public int count;
    public Student(String name , int id , String dept){
        this.name= name;
        this.id= id;
        this.dept = dept;
        System.out.printf("Student object is created\n");
    }
}
