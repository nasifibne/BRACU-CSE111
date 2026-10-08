//home task 3
public class Assignment {

    public int tasks;
    public String difficulty;
    public boolean submission ;

    public void printDetails(){
        System.out.println("number of task "  + tasks);
        System.out.println( "difficulty level "+difficulty);
        System.out.println("Submission required " + submission);
    }
    public String makeOptional(){
        if(submission){
            return "Assignment will not require submission";
        }
        else {
            return "Submission is already not required";
        }
    }


}
