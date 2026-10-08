public class Bird {
    public String name;
    public int status;
    public void flyUp(int x){
        status +=x;
        System.out.printf("%s has fly up %d feet\n",name , x);
    }
    public void flyDown(int x){
        if(x>status){
            System.out.printf("%s cannot fly down %d feet\n",name , x);
        }
        else if(x==status){
            System.out.printf("%s fly down %d feet and landed\n",name , x);
            status=0;
        }
        else {
            System.out.printf("%s fly down %d feet\n",name , x);
            status -=x;
        }
    }
    public void makeNoise(){
        if(name.equals("Parrot")){
            System.out.println("Squawk");
        }
        else if (name.equals("Eagle")){
            System.out.println("Squee");
        }
    }


}
