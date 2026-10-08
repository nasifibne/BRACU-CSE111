import java.util.Scanner;

public class janeElecticity {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.printf("units of electricity \n");
        double elec = sc.nextDouble();;
        System.out.printf("use energy saving");
        boolean energy = sc.nextBoolean();
        System.out.printf("installs solar panels");
        boolean solar = sc.nextBoolean();
        double bill =0, charge =0,consume=elec;
        if (energy){
            consume = elec*.7;
        }
        if (solar){
            consume = elec*.6;
        }
        bill = (consume*9) ;
        if (elec>500){
            charge = (bill*.20);
        }
        bill += charge;
        System.out.println(bill);
    }
}
