package home3;

public class Connect {
    public int total;
    public Student[] advisee = new Student[5];
    public Connect(){
        System.out.printf("Connect is ready to use!\n");
    }
    public void login(Student std){
        if(std.password.equals("null")){
            System.out.printf("Email and password need to be set.\n");
        }
        else {
            if(total<5) {
                advisee[total++] = std;
                std.status = "active";
                System.out.printf("Login successful\n");
            }
            else {
                System.out.printf("Can't take more then 5 advisee\n");
            }
        }
    }
    public void advising(Student nm){
        if(nm.status.equals("active")){
            System.out.printf("You haven't selected any courses.\n");
        }
        else {
            System.out.printf("Please login to advise courses!\n");
        }
    }
    public void advising (Student nm , String s1, String s2, String s3, String s4){
        System.out.printf("You need special approval to take more than 3 courses.\n");
    }
    public void advising (Student nm , String s1, String s2, String s3){
        nm.course[nm.count++] =s1;
        nm.course[nm.count++] =s2;
        nm.course[nm.count++] =s3;
        System.out.printf("Advising successful!\n");
    }
    public void allAdviseeInfo(){
        System.out.printf("Total Advisee: %d\n",total);
        for (int i =0 ; i<total ; i++) {
            System.out.printf("Name: %s ID: %d\n", advisee[i].name, advisee[i].id);
            System.out.printf("Department: %s\n", advisee[i].dept);
            System.out.printf("Advised Course:\n");
            for (int j = 0; j <advisee[i].count ; j++) {
                System.out.printf( advisee[i].course[j] + " ");
            }
            System.out.printf("\n==============\n");
        }
    }
}
