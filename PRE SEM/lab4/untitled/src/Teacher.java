public class Teacher {
    public int count;
    public String name ;
    public String ini ;
    public String[] co = new String[3] ;

    public Teacher(String a , String b){
        name = a;
        ini = b;
        System.out.println("A new teacher has been created");
    }

    public void addCourse(Course a){
        if(count<3){
            co[count++]= a.course;

        }
        else{
            System.out.println("cant add more then 3 course");
        }
    }
    public void printDetail(){
        System.out.println("Name: " +name);
        System.out.println("Initial: " + ini);
        System.out.println("List of courses: ");
        for (int i =0 ; i<count ;i++){
            System.out.println(co[i]);
        }
    }
}
