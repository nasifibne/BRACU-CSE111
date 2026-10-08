public class Player {
        public String name;
        public int age;
        public int match;

        public Player(String s , int a , int r){
            name=s;
            age=a;
            match = r;

        }
        public void print (){
            System.out.println("Name: "+name);
            System.out.println("Age: " + age +" , Total Matches: "+ match);
        }
}
