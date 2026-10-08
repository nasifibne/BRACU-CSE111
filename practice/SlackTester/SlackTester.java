package SlackTester;

public class SlackTester {
        public static void main(String args[]){
            SlackChannel c1 = new SlackChannel("CSE111 Summer 2025");
            System.out.println("1--------------");
            c1.addMember("KNI", "Faculty");
            c1.addMember("PRN", "Faculty");
            System.out.println("2--------------");
            c1.info();
            System.out.println("3--------------");
            c1.addMember("T14", "ST");
            c1.addMember("Aftab");
            c1.addMember("Mou");
            c1.addMember("T65", "ST");
            System.out.println("4--------------");
            c1.info();
            System.out.println("5--------------");
            SlackChannel c2 = new SlackChannel("CSE110 Summer 2025");
            System.out.println("6--------------");
            c2.addMember("KNI", "Faculty");
            c2.addMember("Ria");
            c2.addMember("T45", "ST");
            System.out.println("7--------------");
            c2.info();
        }
}
