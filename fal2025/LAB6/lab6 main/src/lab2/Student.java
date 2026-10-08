package lab2;

public class Student {

    public static int total_students;
    public static double total_marks;

    public String name;
    private int codeMark;
    private int TraceMark;
    public int id;
    public int totalMark;

    public Student(String name){
       this.name = name;
       Student.total_students++;
       this.id = total_students;
    }
    public Student(String name , int cmark , int tmark){
        this.name = name;
        setCodingMarks(cmark);
        setTracingMarks(tmark);
        this.id = ++total_students;
    }
    public void setCodingMarks(int a){
        this.codeMark = a;
        totalMark +=a;
        total_marks +=a;
    }
    public void setTracingMarks(int a){
        this.TraceMark = a;
        totalMark+=a;
        total_marks +=a;
    }
    public void individualDetail(){
        System.out.printf("Name: %s\nID: %d\nCoding Mark: %d\nTracing Marks: %d\n",this.name, this.id, this.codeMark,this.TraceMark);
        if(totalMark<50){
            System.out.printf("%s has failed with %d marks\n",this.name, this.totalMark);
        }
        else {
            System.out.printf("%s has passed with %d marks\n",this.name, this.totalMark);
        }
    }
    public static double averageMarks(){
        if(total_students==0){
            return 0.0;
        }
        else {
            return total_marks/total_students;
        }
    }



}
