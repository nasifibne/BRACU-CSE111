package home2;

public class Student {
    public int id;
    public double cg;
    public String[] course=new String[4];
    public int count;

    public Student(int id){
        this.id = id;
        System.out.printf("A Student with ID %d has been created.\n", this.id);
    }
    public Student(int id , double cg){
        this.id= id;
        this.cg= cg;
        System.out.printf("A student with ID %d and cgpa %.1f has been created.\n", this.id , this.cg);
    }
    public void addCourse(String tittle){
        if(cg==0){
            System.out.printf("Failed to add CSE110\nSet CG first\n");
        }
        else{
            if(cg<3){
                if(count<3){
                    this.course[count++]=tittle;
                }
                else {
                    System.out.printf("Failed to add %s\nCGPA is low, can't add more than 3 courses.\n",tittle);
                }
            }
            else{
                if(count<4){
                    this.course[count++]=tittle;
                }
                else{
                    System.out.printf("Failed to add %s\nMaximum 4 courses allowed\n", tittle);
                }
            }
        }
    }
    public void addCourse(String[] courseArr){
        for(int i =0 ; i<courseArr.length ;i++){
            addCourse(courseArr[i]);
        }
    }
    public void storeCG(double cg){
        this.cg= cg;
    }
    public void removeAllCourse(){
        course = new String[4];
        count=0;
    }
    public void storeID(int id){
        this.id = id;
    }
    public void showAdvisee(){
        System.out.printf("Student ID: %d, CGPA: %.1f\n",this.id, this.cg);
        if(count>0){
            System.out.printf("Added courses are:\n");
            for(int i =0 ; i<count ; i++) {
                System.out.printf(this.course[i] + " ");
            }
            System.out.println();
        }
        else {
            System.out.printf("No courses added\n");
        }
    }



}
