package heat;

public class Heater {
    public String status = "OFF";
    public int level=5;

    public void showInfo(){
        System.out.println("Heater: " + status);
        System.out.println("Heat Level: " + level);
    }
    public void turnOnOff(){
        if(status.equals("OFF")){
            this.status = "ON";
        }
        else{
            this.status = "OFF";
        }
    }
    public String adjustHeat(int x){
        if(this.status.equals("OFF")){
            return  "Heater is OFF. Cannot change heat level";
        }
        else {
            if(x<0 && (this.level+x)>=0){
                this.level +=x;
                return "Heat level changed";
            }
            else if(x>0 && (this.level+x)<=10){
                this.level +=x;
                return "Heat level changed";
            }
            else{
                return "Can't change. Outside the range (0-10)";
            }
        }
    }
}
