public class Student {
    public String name;
    public String prog;

    public void updateName(String name){
        this.name = name;
    }
    public void updateProgram(String prg){
        prog = prg;
    }
    public String accessProgram(){
        return prog;
    }
    public Student(String s , String a ){
        name = s;
        prog = a;
    }
}
