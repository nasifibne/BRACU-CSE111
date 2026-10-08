import java.sql.SQLOutput;
//task4
public class CellPhone {

    public String model = "unknown";
    public int count;
    public String cont;


    public void printDetails(){
        System.out.println("phone model " + model);
        System.out.println("contact stored " +count);
        if(count>=1) {
            System.out.println("Stored contacts");
            System.out.println(cont);
        }
    }
    public void storeContact(String a ){
        if(count>2){
            System.out.println("Memory full. New contact can't be stored.");
        }
        else {
            if(count==0){
                cont = a +"\n";
                count++;
                System.out.println("Contact Stored");
            }
            else {
                cont += a + "\n";
                count++;
                System.out.println("Contact Stored");
            }
        }

    }
}
