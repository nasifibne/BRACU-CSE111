package home2;

public class Department {
    public String name;
    public Student[] std = new Student[5];
    public int count;

    public Department(String name){
        this.name = name;
    }

    public void findStudent(int a ){
        boolean flag = false;
        int temp = 0;
        for (int i =0 ; i<count ;i ++){
            if(a == std[i].id){
                flag = true;
                temp = i;
            }
        }
        if(flag){
            System.out.println("Student info:");
            System.out.printf("Student name: %s\nID: %d\nCGPA: %.2f\n",std[temp].name,std[temp].id,std[temp].cg);
        }
        else {
            System.out.println("Student with this ID doesn't exist, Please give a valid ID");
        }
    }

    public void addStudent(Student s1){
        boolean flag = false;
        for (int i = 0; i < count; i++) {
            if(s1.id== std[i].id){
                flag = true;
            }
        }
        if(!flag){
            if (count < 5) {
                std[count++] = s1;
                System.out.printf("Welcome to CSE department, %s\n", s1.name);
            } else {
                System.out.println("cant add more then 5 students");
            }
        }
        else {
            System.out.println("Student with the same ID already exists, Please try with another ID");
        }
    }

    public void addStudent(Student s1,Student s2, Student s3){
        addStudent(s1);
        addStudent(s2);
        addStudent(s3);
    }

    public void details(){
        System.out.println("Department name: "+ this.name);
        System.out.printf("Number of students: %d\n",this.count);
        System.out.println("Details of the students: ");
        for (int i = 0; i < count; i++) {
            System.out.printf("Student name: %s, ID: %d, cgpa: %.2f\n",std[i].name, std[i].id, std[i].cg);
        }

    }

}
