public class ChickenBurger{

    public String bun = "Sesame";
    public int price = 200;
    public  String sauceOption = "less";
    public String spiceLevel = "not set";

    public String serveBurger(){
        String a ="";
        if (spiceLevel.equals("not set")){
            a = "Cannot serve now. Customize Spice Level first.";

        }
        else {
            a = "The burger is being served:-\nBun Type: " + bun +"\nPrice: " + price +"\nSauce Option: " + sauceOption +"\nSpice Level: "+ spiceLevel+ "\n";
        }
        return a;

    }
    public void customizeSpiceLevel(String s){
        if ((s.equals("Mild") || s.equals("Spicy") || s.equals("Naga") || s.equals("Extreme"))){
            spiceLevel = s;
            System.out.println("Spice level set to "+ spiceLevel );
        }
        else{
            System.out.println("This spice level is unavailable.");
        }
    }

}