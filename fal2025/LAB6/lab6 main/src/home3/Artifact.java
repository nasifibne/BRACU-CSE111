package home3;

public class Artifact {
    private static Artifact[] vault = new Artifact[4];
    private int power;
    private static int count;
    private String name = "Okabe";
    private String product;

    public Artifact(String pro , String keep){
        this.product= pro;
        this.name= keep;
        getpower();
    }

    public Artifact(String pro){
        this.product= pro;
        getpower();
    }

    public void changeName(String product){
        this.product = product;
        power=0;
        getpower();
        System.out.println("Name changed and power recalculated.");
    }

    public String GetName(){
        return this.product;
    }

    public void setKeep(String keep){
        this.name = keep;
    }

    public String getKeep(){
        return this.name;
    }

    public static void AddtoVault(Artifact temp){
        if(count<4){
            vault[count++] = temp;
            System.out.println(temp.getKeep() +  " added "+ temp.GetName()+" successfully to the vault.");
        }
        else {
            System.out.println("!!"+ temp.getKeep() + " unsuccessful in adding "+ temp.GetName()+" to the vault!!");
        }
    }

    public void getpower(){
        if(product.length()%2==0){
            for (int i = 0; i < product.length(); i=i+2) {
                power = power + (int) product.charAt(i);
            }
        }
        else{
            for (int i = 1; i < product.length(); i= i+2) {
                power = power + (int) product.charAt(i);
            }
        }
    }

    public int CalcPower(){
        return power;
    }

    public static void labReport(){
        System.out.println("=== Future Gadget Lab ===");
        for (int i = 0; i < count; i++) {
            System.out.println(vault[i].GetName() + " added by "+ vault[i].getKeep() + " has power of " + vault[i].CalcPower() );
        }
    }

    public static String strongest(){
        int temp= vault[0].CalcPower();
        int flag=0;
        for (int i = 1; i < count ; i++) {
            if(temp<vault[i].CalcPower()){
                temp=vault[i].CalcPower();
                flag =i;
            }
        }
        return vault[flag].product;
    }

    public void revealArtifact(){
        System.out.println(product + " added by " + name + " has power of " + CalcPower());
    }


}
