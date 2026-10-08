import java.util.*;
public class std {
    public double cg;
    public int count;
    public int id;
    public String[] course=new String[4];

    public std(int a ){
        id=a;
        System.out.printf("A student with ID %d has been created.\n",id);
    }
    public std (int a , double x){
        id=a; cg=x;
        System.out.printf("A student with ID %d and cgpa %f has been created.\n",id,cg);
    }
    public void storeCG(double x){
        cg=x;
    }
    public void addCourse(String c){
        if(cg==0){
            System.out.printf("Failed to add %s. Set CG first\n",c);
        }
        else if(cg<3){
            if(count<3){
                course[count++] = c;
            }
            else{
                System.out.println("Failed to add " + c);
                System.out.println("CG is low. Can't add more than 3 courses.");
            }
        }
        else if(count<4){
            course[count++] = c;
        }
        else{
            System.out.println("Failed to add " + c);
            System.out.println("Cant add more then 4 course");
        }

    }
    public void addCourse(String[] c){
        int x = c.length;
        int temp = c.length - count;
        if(cg==0){
            System.out.println("Failed to add course. Set CG first");
        }
        else if(cg<3){
            if(count<3){
                for (int i =0 ; i<x ; i++) {
                    course[count++] = c[i];
                }
            }
            else{
                System.out.println("CG is low. Can't add more than 3 courses.");
            }
        }
        else if((count+ x) <4){
            for (int i =0 ; i<x ; i++) {
                course[count++] = c[i];
            }
        }
        else{
            System.out.println("Cant add more then 4 course");
        }

    }
    public void removeAllCourse(){
        count=0;
    }
    public void storeID(int x){
        id=x;
    }

    public void showAdvisee(){
        System.out.println("Student id: " + id);
        System.out.println("Student cgpa: " + cg);
        if(count==0){
            System.out.println("No courses added.");
        }
        else {
            System.out.println("Added course ");
            for (int i =0 ; i<count ; i++) {
                System.out.println(course[i]);
            }
        }
    }




}
