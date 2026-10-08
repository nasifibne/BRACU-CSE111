package q21;

public class Tester2 {
        public static void main(String[] args) {
            TravelApp g1 = new TravelApp("Rayan");
            TravelApp g2 = new TravelApp("Tisha", 3);
            TravelApp g3 = new TravelApp("Nafi", 2);
            TravelApp g4 = new TravelApp("Lamia", 4);
            TravelApp g5 = new TravelApp("Arin");
            g5.showInfo();
            System.out.println("1----------------");
            g2.showInfo();
            System.out.println("2----------------");
            g5.addCompanion(g1);
            g5.addCompanion(g3);
            System.out.println("3----------------");
            g5.showInfo();
            System.out.println("4----------------");
            g1.showInfo();
            System.out.println("5----------------");
            g2.addCompanion(g1);
            g2.addCompanion(g4);
            System.out.println("6----------------");
            g2.showInfo();
            System.out.println("7----------------");
            g2.addCompanion(g3);
            g2.addCompanion(g5);
            System.out.println("8----------------");
            g5.addCompanion(g4);
            g5.addCompanion(g2);
            System.out.println("9----------------");
            g2.showInfo();
            System.out.println("10----------------");
            g5.showInfo();
        }
}
