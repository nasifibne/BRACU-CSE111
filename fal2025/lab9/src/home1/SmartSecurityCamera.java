package home1;

public class SmartSecurityCamera extends SmartDevice {

    public int storage;
    public int cap;
    public boolean night = false;

    public SmartSecurityCamera(String name, int level , int storage){
        super(name, level);
        this.storage =storage;
        this.cap =storage;
    }

    public void powerOn(){
        if(this.storage>0){
            super.powerOn();
        }
        else {
            System.out.println("Error: "+ super.deviceName+ " storage full. Recording disabled.");
        }
    }

    public void record(boolean temp){
        if (temp){
            this.night = true;
            System.out.println("[IR SENSORS ACTIVE]");
        }
        this.storage--;
        System.out.println("Recording standard footage.");
    }

    public void record(){
        record(false);
    }

    public void powerOff(){
        if(this.night){
            System.out.println("Turning off Night Vision.");
        }
        super.powerOff();
    }

    public void formatCard(String code){

        if (code.equals("ADMIN123")){
            if(super.isActive) {
                System.out.println("REQUEST: Format SD Card initiated.\nAuth Success. Wiping data.\nSUCCESS: Storage restored to " + this.cap+ " GB");
            }
            else {
                System.out.println("REQUEST: Format SD Card initiated.\nERROR: Device must be ON to format.");
            }
        }
        else {
            System.out.println("REQUEST: Format SD Card initiated.\nACCESS DENIED: Incorrect PIN.");
        }
    }

}
