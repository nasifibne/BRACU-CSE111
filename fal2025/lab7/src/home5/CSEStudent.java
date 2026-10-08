package home5;

public class CSEStudent extends Student {

    public static int total;
    public static String[] course = new String[]{"CSE110", "CSE111" ,"CSE220", "CSE221"};

    public CSEStudent(String name, int id){
        super(name,id);
        total++;
    }

    public static void details(){
        System.out.println("Total CSE Students: "+ total );
        System.out.print("Available Lab Based Courses: ");
        for (int i = 0; i < course.length; i++) {
            System.out.print(course[i]+ " ");
        }
        System.out.println();
    }
    public void addLabBasedCourse(String crs){
        boolean flag = false;
        for (int i = 0; i < this.course.length; i++) {
            if(this.course[i].equals(crs)){
                this.courses+= crs + " ";
                flag = true;
            }
        }
        if(!flag){
            System.out.println("It is not a lab based course!");
        }
    }

}
