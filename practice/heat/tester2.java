package heat;
public class tester2 {
        public static void main(String[] args) {
            Heater h1 = new Heater();
            h1.showInfo();
            System.out.println("1----------------");
            h1.turnOnOff();
            System.out.println("2----------------");
            h1.showInfo();
            System.out.println("3----------------");
            System.out.println(h1.adjustHeat(3));
            System.out.println("4----------------");
            h1.showInfo();
            h1.turnOnOff();
            System.out.println("5----------------");
            System.out.println(h1.adjustHeat(-4));
            h1.turnOnOff();
            System.out.println("6----------------");
            System.out.println(h1.adjustHeat(-4));
            h1.showInfo();
            System.out.println("7----------------");
            System.out.println(h1.adjustHeat(8));
            System.out.println(h1.adjustHeat(-100));
            System.out.println("8----------------");
            h1.showInfo();
            System.out.println("9----------------");
            System.out.println(h1.adjustHeat(6));
            h1.turnOnOff();
            System.out.println("10----------------");
            h1.showInfo();
        }
}
