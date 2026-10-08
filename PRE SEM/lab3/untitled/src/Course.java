public class Course {
    public String name;
    public String code;
    public String syl = "";
    public int course;

    public void updateDetails(String a , String b){
        name = a;
        code = b;
    }
    public void printDetails(){
        System.out.println("Course details:");
        System.out.println("Course Name: "+ name);
        System.out.println("Course Code: " + code);
        System.out.println("Course Syllabus:");
        if(course==0){
            System.out.println("No content yet");
        }
        else{
            System.out.println(syl);
        }
    }
    public void addContent(String a ){
        if(course==0){
            System.out.println(a + " was added.");
            syl = a ;
        }
        else if (course<4){
            System.out.println(a + " was added.");
            syl = syl +  ", " + a;
        }
        else{
            System.out.println("Cannot add more content");
        }
        course++;
    }
    public void addContent(String a , String b){
        addContent(a);
        addContent(b);

    }
}
