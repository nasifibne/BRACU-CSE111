package task3;

public class Nokia extends Mobile {

    public double balance;

    public Nokia(String model, boolean sim , String imei, int bal){
        super(model,imei,sim);
        this.balance = bal;
    }
    public String toString (){
        return super.toString()+ "\nBalance: " + this.balance + " TK";
    }
    public void rechargeSIMCard(int amo){
        this.balance+= amo;
        System.out.println("Recharge successful! Current balance "+this.balance+" TK.");
    }
    public String dialCall(String  num ){
        if(simCardStatus) {
            if (this.balance > 0) {
                String code = "";
                for (int i = 0; i < 3; i++) {
                    code += num.charAt(i);
                }
                if (getCountryName(code) == null) {
                    return "Dialing is not allowed in this region.";
                } else {
                    return "Dialing the number " + num + " to " + getCountryName(code) + " region.";
                }
            } else {
                return "Insufficient balance! Please recharge.";
            }
        }
        else{
            return "No SIM card available! Please check the SIM card connectivity.";
        }
    }



}
