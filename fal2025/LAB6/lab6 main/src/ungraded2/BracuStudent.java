package ungraded2;

public class BracuStudent {

    public String name;
    private String loc;
    public boolean pass= false;

    public BracuStudent (String name , String loc){
        this.name = name;
        setLocation(loc);
    }

    public void setLocation(String loc){
        this.loc = loc;
    }
    public String  getLoc(){
        return loc;
    }
    public void showDetails(){
        System.out.println("Student name: " + this.name);
        System.out.println("Lives in " + getLoc());
        System.out.println("Have bus pass? " + this.pass);
    }
    public void collectPass(){
        this.pass= true;
    }
}
