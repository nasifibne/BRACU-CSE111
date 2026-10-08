package lab04;

public class Teacher {
    public String name;
    public String initial;
    public String[] course = new String[3];
    public int count;

    public Teacher(String name , String initial){
        this.name= name;
        this.initial = initial;
        System.out.printf("A new teacher has been created.\n");
    }
    public void addCourse(Course c1){
        if(count<3) {
            course[count++] = c1.course;
        }
        else{
            System.out.printf("A teacher can not add a maximum of 3 courses.");
        }
    }
    public void printDetail(){
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Initial: %s\n", this.initial);
        System.out.printf("List of courses \n");
        for(int i = 0 ; i<count ; i++){
            System.out.printf(course[i] +"\n");
        }
    }
}
